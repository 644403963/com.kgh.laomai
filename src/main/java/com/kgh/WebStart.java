package com.kgh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

	@SpringBootApplication
	@EnableTransactionManagement//�����������
//	@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
	public class WebStart {
	    public static void main(String[] args) {
	        SpringApplication.run(WebStart.class, args);
	    }
	}