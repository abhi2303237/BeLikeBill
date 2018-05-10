package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import java.awt.EventQueue;

import com.knight.ui.LoginDialog;

@SpringBootApplication
public class BeLikeBillApplication {

	public static void main(String[] args) {
		 new SpringApplicationBuilder(BeLikeBillApplication.class)
                .headless(false)
                .web(false)
                .run(args);
		
		EventQueue.invokeLater(() -> {
			LoginDialog login;
		});
	}
}
