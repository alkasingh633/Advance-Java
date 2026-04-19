package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
//import java.util.stream.Consumer;

public class SortedComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(4,3,5,2,6,7,5,4,9,2);
		List<Integer> sortedList = numbers.stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
				sortedList.forEach(System.out::println);

	}

}
