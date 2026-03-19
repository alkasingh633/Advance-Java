package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList("Java", "Python", "C", "Next.js", "Node.js");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(data);
		list.stream().filter(name ->name.length()>4).forEach(System.out::println);


	}

}
