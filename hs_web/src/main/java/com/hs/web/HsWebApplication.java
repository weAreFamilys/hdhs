package com.hs.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hs.web.mapper")
public class HsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsWebApplication.class, args);
	}
}
