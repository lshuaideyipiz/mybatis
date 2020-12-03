package edu.nf.homeWork.dao;

import edu.nf.homeWork.entity.Book;

public interface BookDao {
    void save(Book book);
    void delete(int bookId);
    void update(int bookId,String bookName,String BookAuthor,int bookPrice);
}
