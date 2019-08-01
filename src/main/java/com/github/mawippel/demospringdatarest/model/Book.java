package com.github.mawippel.demospringdatarest.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class Book {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String title;

	@Column(name = "author_name")
	private String authorName;

	@Column(name = "release_date")
	private LocalDateTime releaseDate;

}
