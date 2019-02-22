package com.hzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hzb.config.PropertiesListener;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WebApplication.class);
        // 第四种方式：注册监听器
        application.addListeners(new PropertiesListener("app-config.properties"));
        application.run(args);
	}

}
