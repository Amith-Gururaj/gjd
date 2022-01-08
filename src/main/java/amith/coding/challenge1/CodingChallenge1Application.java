package amith.coding.challenge1;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import amith.coding.challenge1.entity.Employee;
import amith.coding.challenge1.service.EmployeeService;

@SpringBootApplication
public class CodingChallenge1Application {

	public static void main(String[] args) {
		
		ApplicationContext ac=SpringApplication.run(CodingChallenge1Application.class, args);
		
		EmployeeService empservice=ac.getBean(EmployeeService.class);
		
		empservice.addEmployee(new Employee(1,"Mahesh",26000));
		empservice.addEmployee(new Employee(2,"Vishal",36000));
		empservice.addEmployee(new Employee(3,"Arun",16000));
		empservice.addEmployee(new Employee(4,"Amith",26000));
		empservice.addEmployee(new Employee(5,"Harish",36000));
		empservice.addEmployee(new Employee(6,"Sachin",23000));
		empservice.addEmployee(new Employee(7,"Simran",42000));
		empservice.addEmployee(new Employee(8,"Guru",54000));
		empservice.addEmployee(new Employee(9,"Vijay",16000));
		empservice.addEmployee(new Employee(10,"Harsha",8000));
		
		Iterable<Employee> emp = empservice.getEmployee();
		
		Iterator<Employee> itr = emp.iterator();
		
		System.out.println("\nBefore Sorting...");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterable<Employee> sortedemp = empservice.getSortedList();
		
		itr = sortedemp.iterator();
		
		System.out.println("\nAfter Sorting...");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
