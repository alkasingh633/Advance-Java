package StreamMinMax;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxEg {
	public static void main(String[]args) {
		List<Integer> list = Arrays.asList(12, 1, 4, 100, 200, 150, 47, 57, 99);
		List<Integer> sortedList = list.stream().sorted((a,b)->a-b).toList();
		System.out.println(list);
		System.out.println(sortedList);
		Optional<Integer> result = list.stream().max((a,b)->1);
		result.ifPresent(System.out::println);
	}

}
