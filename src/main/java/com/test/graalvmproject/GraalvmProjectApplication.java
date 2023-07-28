package com.test.graalvmproject;

import com.test.graalvmproject.config.HintsRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(HintsRegistrar.class)
public class GraalvmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmProjectApplication.class, args);
	}

}
