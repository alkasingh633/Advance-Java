package MapQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Empolyees{
	int eid;
	String name;
	String dept;
	public Empolyees(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	}
}

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employees> list = new ArrayList<Empolyees>();
		list.add(new Employees(1,"Ankit","MCA"));
		list.add(new Employee(2,"Rahul","CSE"));
		List<String> empNames = list
				.stream()
				.map(emp->emp.name)

	}

}


