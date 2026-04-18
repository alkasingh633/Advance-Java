 package Z_MyPractice;
 import java.util.*;
 import java.util.List;
 import java.util.stream.Stream;
 import java.util.stream.Collectors;

public class SortedEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(4,3,5,2,6,7,5,4,9,2);
		
		List<Integer> sortedNumbers  =numbers.stream().sorted().collect(Collectors.toList());
		sortedNumbers.forEach(System.out::println);

	}

}
