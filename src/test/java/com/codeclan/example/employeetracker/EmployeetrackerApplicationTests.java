package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Department;
import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.repositories.DepartmentRepository;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canDbBePopulated() {
		Department hr = new Department("HR");
		departmentRepository.save(hr);
		Employee jack = new Employee("Jack", "Ramsay", "MI5-007", hr);
		employeeRepository.save(jack);
	}

}
