package StreamMinMax;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 20, 5, 40, 15);
		List<Integer> sortedList = list.stream().sorted((a,b)->a-b).toList();
		System.out.println(list);
		System.out.println(sortedList);
		Optional<Integer> result = list.stream().max((a,b)->1);
		result.ifPresent(System.out::println);

	}

}
