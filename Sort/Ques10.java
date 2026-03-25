package Sort;
import java.util.Arrays;
import java.util.List;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
		System.out.println(list);
		List<String> greater = list.stream().sorted().toList();
		System.out.println(greater);

	}


}
