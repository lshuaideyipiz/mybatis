package edu.nf.ch01night.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    //SqlSessionFactory是一个工厂类，用于专门创建Sqlsession对象，Sqlsession就是具体的连接对象
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            //查找mybatis核心配置文件进行解析，解析为一个输出流
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            //使用SqlSessionFactoryBuilder类来解析并创建出SqlSessionFactory对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //创建SqlSessionFactory
            sqlSessionFactory = builder.build(inputStream);
        }catch (Exception e){

        }
    }

    //参数目的为是否自动提交事务
    public static SqlSession getSqlSession(boolean autoCommit){
        return sqlSessionFactory.openSession(autoCommit);
    }


}
