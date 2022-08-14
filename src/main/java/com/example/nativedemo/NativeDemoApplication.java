package com.example.nativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.shell.context.InteractionMode;
import org.springframework.shell.context.ShellContext;

@SpringBootApplication
public class NativeDemoApplication {

	public static void main(String[] args) {
		if (args.length == 0) {
			args = new String[] { "help" };
		}
		ConfigurableApplicationContext applicationContext = SpringApplication.run(NativeDemoApplication.class, args);
		ShellContext shellContext = applicationContext.getBean(ShellContext.class);
		shellContext.setInteractionMode(InteractionMode.NONINTERACTIVE);
	}

}
