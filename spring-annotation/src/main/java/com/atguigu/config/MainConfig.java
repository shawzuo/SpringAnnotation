package com.atguigu.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value="com.atguigu", excludeFilters = {
		@Filter(type=FilterType.ANNOTATION,classes= {Service.class})
})
public class MainConfig {
	
	
}
