package edu.nf.ch01.util;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *Mybatis的连接工具类
 */
public class MybatisUtils {
    //SqlSessionFactory是一个工厂类，用于专门创建SqlSession对象
    //而SqlSession就是具体的连接对象，它封装了Connection等jdbc的API，用来操作数据酷
    private static SqlSessionFactory sqlSessionFactory;

    /**
     *初始化SqlSessionFactory
     */
    static {
        try{
            //首先查找mybatis的核心配置文件进行解析
            //解析为一个输入流
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //使用SqlSessionFactoryBuilder类来解析并创建出SqlSessionFactory对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //创建SqlSessionFactory
            sqlSessionFactory  = builder.build(is);
        }catch (IOException e){
            e.printStackTrace();;
        }
    }

    /**
     * @param autoCommit true表示自动提交事务，false表示手动提交事务
     */
    public static SqlSession getSqlSession(boolean autoCommit){
        //通过上面初始化号的SqlSessionFactory来创建SqlSession对象11
        return sqlSessionFactory.openSession(autoCommit);
    }

    public static void main(String[] args) {
        System.out.println(getSqlSession(true));
    }

}
