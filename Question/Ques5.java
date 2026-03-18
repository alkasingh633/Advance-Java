package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", null, "Spring", null, "React");

		List<String> result = list.stream()
		.filter(str -> str != null)
		.collect(Collectors.toList());
		System.out.println(result);
		
//		ArrayList<String> list
		
//		list.addAll(data);
//		list.stream()
		

	}

}
