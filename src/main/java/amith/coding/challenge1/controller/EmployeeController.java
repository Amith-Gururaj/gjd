package amith.coding.challenge1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import amith.coding.challenge1.entity.Employee;
import amith.coding.challenge1.service.EmployeeService;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empservice;

	public EmployeeController(EmployeeService empservice) {
		super();
		this.empservice = empservice;
	}
	
	@PostMapping(path="/add")
	public @ResponseBody String add(@RequestBody Employee e)
	{
		return empservice.addEmployee(e);
	}
	
	@GetMapping(path="/get")
	public @ResponseBody Iterable<Employee> get()
	{
		return empservice.getEmployee();
	}
	
	@GetMapping(path="/getsorted")
	public @ResponseBody Iterable<Employee> getsorted()
	{
		return empservice.getSortedList();
	}
}
