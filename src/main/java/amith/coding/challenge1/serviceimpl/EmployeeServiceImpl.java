package amith.coding.challenge1.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import amith.coding.challenge1.entity.Employee;
import amith.coding.challenge1.service.EmployeeService;

@Service
@Component
public class EmployeeServiceImpl implements EmployeeService
{
	List<Employee> employee=new ArrayList<>();
	
	@Override
	public String addEmployee(Employee e) {
		employee.add(e);
		return "Employee Added Successfully";
	}

	@Override
	public Iterable<Employee> getEmployee() {	
		return employee;
	}

	@Override
	public Iterable<Employee> getSortedList() {
		Collections.sort(employee);
		return employee;
	}

	
}
