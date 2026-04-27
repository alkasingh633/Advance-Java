package Z_MyPractice;


import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(34, 56,78,2,5,89,45, 59);
		
		List<Integer> sortedNumbers  =numbers.stream().sorted().collect(Collectors.toList());
		sortedNumbers.forEach(System.out::println);

	}

}



