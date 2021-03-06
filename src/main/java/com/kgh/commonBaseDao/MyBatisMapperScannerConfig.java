package com.kgh.commonBaseDao;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.kgh.**.mapper");//ɨ���·���µ�dao
        Properties properties = new Properties();
        properties.setProperty("mappers", "com.kgh.commonBaseDao.BaseMapper");//ͨ��dao
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "oracle");
      //主键UUID回写方法执行顺序,默认AFTER,可选值为(BEFORE|AFTER)
        properties.setProperty("ORDER","BEFORE");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

}
