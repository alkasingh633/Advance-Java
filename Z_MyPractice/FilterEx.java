package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}

public class FilterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Aman", 10000));
		empList.add(new Employee(1, "Robin", 12000));
		empList.add(new Employee(1, "Ankit", 15000));
		empList.add(new Employee(1, "Raz", 18000));
		
//		System.out.println(empList);
//		List<Employee> list2 = empList.stream()
//		.filter(e -> e.salary>12000)
//		.collect(Collectors.toList());
//		list2.forEach(e->System.out.println(e.name + " "+ e.salary));

//		OR
		empList.stream().filter(e->e.salary>12000)
		.forEach(e-> System.out.println(e.name+" "+ e.salary));
	}

}
