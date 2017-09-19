package com.zhiyou100.util.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DataSourceDemo04 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		int currentPage = 1;
		int lineSize = 3;
		String sql = "SELECT nid,title,pubdate,note FROM news WHERE title LIKE ? LIMIT ?,?";
		List<News> all = jt.query(sql, new Object[]{"%%", (currentPage - 1) * lineSize, lineSize },new RowMapper<News>() {

			@Override
			public News mapRow(ResultSet rs, int rowNum) throws SQLException {

				News vo = new News();
				vo.setNid(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPubdate(rs.getDate(3));
				vo.setNote(rs.getString(4));
				return vo;
			}
			
		});
		System.out.println(all);
	}

}
