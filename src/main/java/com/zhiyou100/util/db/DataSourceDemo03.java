package com.zhiyou100.util.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class DataSourceDemo03 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		KeyHolder key = new GeneratedKeyHolder(); //这个类可以取得增长后的ID
		String sql = "INSERT INTO news(title,pubdate,note) VALUES (?,?,?)";
		jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				PreparedStatement sta = con.prepareStatement(sql);
				sta.setString(1, "没有什么能够阻挡");
				sta.setDate(2, new java.sql.Date(new Date().getTime()));
				sta.setString(3, "我对自由的向往");
				return sta;
			}
		},key);
		int len = jt.update(sql, "卖报卖报",new Date(),"三块钱一份。");
		System.out.println(key.getKey());
		System.out.println(len);
		
	}

}
