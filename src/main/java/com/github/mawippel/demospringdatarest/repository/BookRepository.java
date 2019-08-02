package com.github.mawippel.demospringdatarest.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.github.mawippel.demospringdatarest.model.Book;

@Repository
//This could be done to set the projection as the default query, without accessing '?projection=aa'
// @RepositoryRestResource(excerptProjection = BookDetailView.class)
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

	List<Book> findByReleaseDateBefore(LocalDateTime date);

	List<Book> findByTitleStartsWith(String title);

}
