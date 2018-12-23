package com.nf.demo.myDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nf.demo.myDemo")
@PropertySource("classpath:jdbc.properties")
@Import({ JDBCTemplateConfig.class })
public class SpringConfig {

}
