package Sort;
import java.util.Arrays;
import java.util.List;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "SpringBoot", "API", "Microservice", "SQL");
		System.out.println(list);
		List<String> sortLength = list.stream()
				.sorted((a,b)->b.length() -a.length()).toList();
		System.out.println(sortLength);

	}


}


