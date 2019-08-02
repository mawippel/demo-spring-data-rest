package com.github.mawippel.demospringdatarest.model.projections;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.github.mawippel.demospringdatarest.model.Book;
import com.github.mawippel.demospringdatarest.model.BookType;

@Projection(name = "bookDetailsView", types = { Book.class })
public interface BookDetailView {

	Integer getId();

	String getTitle();

	@Value("#{target.authorName}")
	String getNameOfAuthor();

	LocalDateTime getReleaseDate();

	BookType getBookType();
	
	@Value("#{target.authorName.split(' ')[0]}")
	String getFirstNameOfAuthor();
	
}
