package com.example.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.SpringJDBCDemo.model.Estudiantes;
import com.example.SpringJDBCDemo.repo.EstudianteRepo;


@SpringBootApplication
public class SpringJdbcDemoApplication {

		public static void main(String[] args)
		{
			ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

			Estudiantes estudiante1 = context.getBean(Estudiantes.class);
			estudiante1.setCarnet(111);
			estudiante1.setNombre("marcos");
			estudiante1.setCarrera("tecnologia");

			EstudianteRepo repo = context.getBean(EstudianteRepo.class);
			repo.save(estudiante1);

			System.out.println(repo.findAll());
		}

	}
