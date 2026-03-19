package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

class Student{
	private int sid;
	private String name;
	private int marks;
	public Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

}
public class quest16 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Student1", 50));
		list.add(new Student(2,"Student2", 50));
		list.add(new Student(3,"Student3", 60));
		list.add(new Student(4,"Student4", 75));
		list.add(new Student(5,"Student5", 34));
		list.add(new Student(6,"Student6", 80));
		list.stream()
		.filter(student -> student.getMarks()>60)
//		.forEach(System.out::println);
		.forEach((student)->{
			String result = String.format("\t%d\t5s\t\t%d",
					student.getSid(),student.getName(), student.getMarks());
			System.out.println(result);
		});

	}

}
