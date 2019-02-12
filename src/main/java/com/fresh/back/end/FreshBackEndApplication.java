package com.fresh.back.end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.fresh.back.end.mapper")
public class FreshBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshBackEndApplication.class, args);
	}

}

