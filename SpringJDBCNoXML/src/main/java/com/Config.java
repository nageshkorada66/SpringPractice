package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		DataSource dataSource = dataSource();
		return new JdbcTemplate(dataSource);
	}

	public DataSource dataSource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		
		dmds.setUrl("jdbc:mysql://localhost:3306/spring");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;
	}
}
