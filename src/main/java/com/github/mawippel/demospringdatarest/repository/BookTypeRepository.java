package com.github.mawippel.demospringdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.github.mawippel.demospringdatarest.model.BookType;

@Repository
@RepositoryRestResource(path="btype", collectionResourceRel = "btype")
public interface BookTypeRepository extends JpaRepository<BookType, Integer> {

}
