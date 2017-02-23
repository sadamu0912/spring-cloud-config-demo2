package com.example.config;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class DataSourceConfig {

	@Autowired
	Environment env;
	
	@Bean
	public SqlSessionFactoryBean getSqlSessionFactoryBean(){
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setTypeAliasesPackage("com.example.model");
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		//configuration.setLogImpl(Log4j2Impl.class);
		bean.setConfiguration(configuration);
		bean.setVfs(SpringBootVFS.class);
		return bean;
	}
	
	@Bean
	public javax.sql.DataSource getDataSource(){
		DataSource dataSource = new DataSource();
		PoolProperties poolProperties =  new PoolProperties();
		poolProperties.setUrl(env.getProperty("spring.datasource1.url"));
		poolProperties.setDriverClassName(env.getProperty("spring.datasource1.driver-class-name"));
		poolProperties.setUsername("spring.datasource1.username");
		poolProperties.setPassword(env.getProperty("spring.datasource1.password"));
		
		dataSource.setPoolProperties(poolProperties);
		return dataSource;
	}
	
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager(){
		return new DataSourceTransactionManager(getDataSource());
	}
}
