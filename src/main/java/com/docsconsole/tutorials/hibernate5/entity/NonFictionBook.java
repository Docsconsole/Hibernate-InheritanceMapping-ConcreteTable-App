package com.docsconsole.tutorials.hibernate5.entity;


import javax.persistence.*;

@Entity
@Table(name="nonfiction_book3")
@AttributeOverrides({
        @AttributeOverride(name="BOOK_ID", column=@Column(name="BOOK_ID")),
        @AttributeOverride(name="BOOK_NAME", column=@Column(name="BOOK_NAME"))
})
public class NonFictionBook extends Book{

    @Column(name = "BOOK_PRICE")
    private Double bookPrice;
    @Column(name = "BOOK_TYPE")
    private String bookType;

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}