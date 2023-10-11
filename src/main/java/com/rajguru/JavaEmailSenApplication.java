package com.rajguru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rajguru.service.EmailSender;

@SpringBootApplication
public class JavaEmailSenApplication implements CommandLineRunner {
	@Autowired
	EmailSender emailSender;

	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSender.sendEmail("rajguruv737@gmail.com", "SMPP Email testing..!", "/welcome-template",
				emailSender.createSourceMap("test", "1234"));
	}

}
