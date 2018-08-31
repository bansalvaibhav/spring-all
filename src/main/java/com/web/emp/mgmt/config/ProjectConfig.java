/**
 * 
 */
package com.web.emp.mgmt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;

/**
 * @author vaibhav.bansal
 *
 */
public class ProjectConfig {
	
	//configuration specific to H2 database
		private static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
		private static String DATABASE_DRIVER="org.h2.Driver";
		private static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
		private static String DATABASE_USERNAME="sa";
		private static String DATABASE_PASSWORD="";

		
		@Bean
		public DataSource getDataSource(){
			//providing database connection information
			BasicDataSource datasource = new BasicDataSource();
			datasource.setDriverClassName(DATABASE_DRIVER);
			datasource.setUrl(DATABASE_URL);
			datasource.setUsername(DATABASE_USERNAME);
			datasource.setPassword(DATABASE_PASSWORD);
			
			return datasource;
		}

}
