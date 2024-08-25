package dev.vmn.h2_demo;

import dev.vmn.h2_demo.model.Department;
import dev.vmn.h2_demo.repository.DepartmentRepository;
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
	CommandLineRunner commandLineRunner(DepartmentRepository departmentRepository){
		return args -> {
			departmentRepository.save(new Department(1,"CS"));
			departmentRepository.save(new Department(2,"ECE"));
			departmentRepository.save(new Department(3,"ENTC"));
		};
	}

}
