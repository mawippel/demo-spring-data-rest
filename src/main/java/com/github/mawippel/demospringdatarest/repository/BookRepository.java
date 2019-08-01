package com.github.mawippel.demospringdatarest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.github.mawippel.demospringdatarest.model.Book;

@Repository
@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

}
