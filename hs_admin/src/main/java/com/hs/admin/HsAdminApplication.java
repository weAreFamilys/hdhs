package com.hs.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hs.admin.mapper")
public class HsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsAdminApplication.class, args);
	}
}
