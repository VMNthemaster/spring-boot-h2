package dev.vmn.h2_demo;

import dev.vmn.h2_demo.model.Teacher;
import dev.vmn.h2_demo.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(TeacherRepository teacherRepository){
		return args -> {
			teacherRepository.save(new Teacher(1,"Varad", 1));
		};
	}

}
