package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,56,7,89,10);
		Integer smallElement = listOfIntegers.stream()
		.min((e1,e2)->e1.compareTo(e2))
		.get();
		System.out.println("smallest element "+ smallElement);
		
		
		Integer biggestElement = listOfIntegers.stream()
				.max((e1,e2)->e1.compareTo(e2))
				.get();
				System.out.println("Biggest element "+ biggestElement);

	}

}
