package com.zhiyou100.util.db;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceDemo {

	public static void main(String[] args) throws Exception {

		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("org.gjt.mm.mysql.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/springdb");
		dmds.setUsername("root");
		dmds.setPassword("123456");
		DataSource source = dmds;
		System.out.println(source.getConnection());
	}

}
