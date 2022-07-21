package com.dao.impl;


import com.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDAO<T>{//范型指定具体的类型
    private QueryRunner qr=new QueryRunner();

    //开发通用的dml方法，针对任意的表
    public int update(String sql,Object... parameters){
        Connection connection=null;
        try {
            connection= JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    public List<T> queryMulti(String sql,Class<T> clazz,Object... parameters){
        Connection connection=null;
        try {
            connection= JDBCUtilsByDruid.getConnection();
            return qr.query(connection,sql,new BeanListHandler<>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    public T querySingle(String sql,Class<T> clazz,Object... parameters){
        Connection connection=null;
        try {
            connection= JDBCUtilsByDruid.getConnection();
            return qr.query(connection,sql,new BeanHandler<>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    public Object queryScalar(String sql,Object... parameters){
        Connection connection=null;
        try {
            connection= JDBCUtilsByDruid.getConnection();
            return qr.query(connection,sql,new ScalarHandler(),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }



}
