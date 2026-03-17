package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;


//Write a java program using Stream API filter( ) to print all string starting with "A" from the list:
//["Amit", "Ravi", "Anil", "Vikas" , "Rahul"]
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("Amit", "Ravi", "Anil", "Vikas" , "Rahul");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(data);
		list.stream().filter(name ->name.startsWith("A")).forEach(System.out::println);
	}

}
