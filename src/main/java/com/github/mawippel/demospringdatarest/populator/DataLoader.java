package com.github.mawippel.demospringdatarest.populator;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.github.mawippel.demospringdatarest.model.Book;
import com.github.mawippel.demospringdatarest.model.BookType;
import com.github.mawippel.demospringdatarest.repository.BookRepository;
import com.github.mawippel.demospringdatarest.repository.BookTypeRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookTypeRepository bookTypeRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		BookType manga = BookType.builder().type("Manga").build();
		bookTypeRepository.save(manga);
		
		BookType horror = BookType.builder().type("Horror").build();
		bookTypeRepository.save(horror);
		
		Book book = Book.builder()
				.title("Pride and Prejudice")
				.authorName("Jane Austen")
				.releaseDate(LocalDateTime.now())
				.bookType(manga)
				.build();
		Book book2 = Book.builder().title("1Z0-808")
				.authorName("Scott Selikoff and Jeanne Boyarsky")
				.releaseDate(LocalDateTime.now())
				.bookType(manga)
				.build();
		Book book3 = Book.builder().title("1Z0-809")
				.authorName("Scott Selikoff and Jeanne Boyarsky")
				.releaseDate(LocalDateTime.now())
				.bookType(horror)
				.build();
		Book book4 = Book.builder().title("Hamlet")
				.authorName("William Shakespeare")
				.releaseDate(LocalDateTime.now())
				.bookType(horror)
				.build();
		bookRepository.saveAll(Arrays.asList(book, book2, book3, book4));
	}

}
