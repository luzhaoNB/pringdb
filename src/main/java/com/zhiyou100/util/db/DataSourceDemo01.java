package com.zhiyou100.util.db;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceDemo01 {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		DataSource source = ctx.getBean("dataSource",DataSource.class) ;	// 向上转型
		System.out.println(source.getConnection());
//		Logger.getLogger(DataSource.class).info(source.getConnection());
		
	}

}
