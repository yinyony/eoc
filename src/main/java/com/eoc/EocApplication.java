package com.eoc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableSecurity
@SpringBootApplication
@MapperScan("com.eoc.mapper")
public class EocApplication {
	public static void main(String[] args) {
		SpringApplication.run(EocApplication.class, args);
	}
}
