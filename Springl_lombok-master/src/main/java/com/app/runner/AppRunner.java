package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;

@Component
public class AppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Vipin");
		e.setEmpSal(4.5);
		System.out.println(e);
	}

}
