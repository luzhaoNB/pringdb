package com.zhiyou100.util.db;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataSourceDemo02 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "INSERT INTO news(title,pubdate,note) VALUES (?,?,?)";
		int len = jt.update(sql, "卖报卖报",new Date(),"三块一份。");
		System.out.println(len);
		
	}

}
