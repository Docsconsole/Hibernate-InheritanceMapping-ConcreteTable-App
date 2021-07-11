package com.docsconsole.tutorials.hibernate5.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_3")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}