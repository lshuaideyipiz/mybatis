package edu.nf.homeWork.dao.impl;

import edu.nf.homeWork.dao.BookDao;
import edu.nf.homeWork.entity.Book;
import edu.nf.homeWork.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BookDaoImpl implements BookDao {
    @Override
    public void save(Book book) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BookDao dao = sqlSession.getMapper(BookDao.class);
            dao.save(book);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void delete(int bookId) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BookDao dao = sqlSession.getMapper(BookDao.class);
            dao.delete(bookId);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void update(int bookId, String bookName, String bookAuthor, int bookPrice) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BookDao dao = sqlSession.getMapper(BookDao.class);
            dao.update(bookId,bookName,bookAuthor,bookPrice);
        }catch (Exception e){
            throw e;
        }
    }
}
