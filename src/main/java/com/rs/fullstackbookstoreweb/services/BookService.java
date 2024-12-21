package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.AgeGroup;
import com.rs.fullstackbookstoreweb.entities.Book;
import com.rs.fullstackbookstoreweb.entities.Category;
import com.rs.fullstackbookstoreweb.entities.Language;
import com.rs.fullstackbookstoreweb.repository.AgeGroupRepository;
import com.rs.fullstackbookstoreweb.repository.BookRepository;
import com.rs.fullstackbookstoreweb.repository.CategoryRepository;
import com.rs.fullstackbookstoreweb.repository.LanguageRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService extends GenericServiceImpl<Book, Integer> {

	private final CategoryRepository categoryRepository;
	private final LanguageRepository languageRepository;
	private final AgeGroupRepository ageGroupRepository;

	public BookService(BookRepository repository, CategoryRepository categoryRepository,
	                   LanguageRepository languageRepository, AgeGroupRepository ageGroupRepository) {
		super(repository);
		this.categoryRepository = categoryRepository;
		this.languageRepository = languageRepository;
		this.ageGroupRepository = ageGroupRepository;
	}

	public Book saveBook(Book book) {
		// Kiểm tra sự tồn tại của Category
		Optional<Category> category = categoryRepository.findById(book.getCategory().getId());
		if (category.isEmpty()) {
			throw new RuntimeException("Category not found");
		}

		// Kiểm tra sự tồn tại của Language
		Optional<Language> language = languageRepository.findById(book.getLanguage().getId());
		if (language.isEmpty()) {
			throw new RuntimeException("Language not found");
		}

		// Kiểm tra sự tồn tại của AgeGroup
		Optional<AgeGroup> ageGroup = ageGroupRepository.findById(book.getAgeGroup().getId());
		if (ageGroup.isEmpty()) {
			throw new RuntimeException("AgeGroup not found");
		}

		// Gán lại các đối tượng từ cơ sở dữ liệu vào Book
		book.setCategory(category.get());
		book.setLanguage(language.get());
		book.setAgeGroup(ageGroup.get());

		// Lưu và trả về Book
		return super.save(book);
	}
}
