package MapQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("sachin","rahul","vani");
		System.out.println(names);
		List<String> result = names.stream()
				.map(name-> name.toUpperCase())
				.toList();
//		.collect(CollectorstoList());
		System.out.println(result);

	}

}
