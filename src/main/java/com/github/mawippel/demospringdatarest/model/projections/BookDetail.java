package com.github.mawippel.demospringdatarest.model.projections;

import java.time.LocalDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.github.mawippel.demospringdatarest.model.Book;
import com.github.mawippel.demospringdatarest.model.BookType;

@Projection(name = "bookDetails", types = { Book.class })
public interface BookDetail {

	Integer getId();

	String getTitle();

	String getAuthorName();

	LocalDateTime getReleaseDate();

	BookType getBookType();

}
