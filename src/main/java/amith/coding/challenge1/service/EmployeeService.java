package amith.coding.challenge1.service;

import org.springframework.stereotype.Component;

import amith.coding.challenge1.entity.Employee;

@Component
public interface EmployeeService {

	public String addEmployee(Employee e);

	public Iterable<Employee> getEmployee();

	public Iterable<Employee> getSortedList();

}
