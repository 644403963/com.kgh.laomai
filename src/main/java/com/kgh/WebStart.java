package com.kgh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

	@SpringBootApplication
	@EnableTransactionManagement//�����������
//	@ServletComponentScan  //过滤器监听器 拦截器用
//	@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
	public class WebStart {
	    public static void main(String[] args) {
	        SpringApplication.run(WebStart.class, args);
	    }
	}