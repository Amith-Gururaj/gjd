package amith.coding.challenge1.entity;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) 
	{
		int res = o.salary-this.salary; 
		if(res==0)
		{
			res=this.name.compareTo(o.name);
		}
		return res; // if this returns positive value then the objects will be swapped
	}
	@Override
	public String toString() {
		return   id +"  " + name + "  " + salary ;
	}
	
	
}
