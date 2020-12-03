package edu.nf.homeWork.test;

import edu.nf.homeWork.dao.BookDao;
import edu.nf.homeWork.dao.impl.BookDaoImpl;
import edu.nf.homeWork.entity.Book;
import org.junit.Test;

public class BookTest {

    @Test
    public void saveTest(){
        Book book = new Book("ZZLZ","SLGM",150);
        BookDao dao = new BookDaoImpl();
        dao.save(book);
    }

    @Test
    public void update(){
        BookDao dao = new BookDaoImpl();
        dao.update(1,"java","javaAuthor",160);
    }

    @Test
    public void delete(){
        BookDao dao = new BookDaoImpl();
        dao.delete(1);
    }

}
