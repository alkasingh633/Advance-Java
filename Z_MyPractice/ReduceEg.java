package Z_MyPractice;
import java.util.*;
import java.util.stream.Stream;
import java.util.List;

public class ReduceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5,6,7,8);
		listOfIntegers.stream()
		.reduce((e1,e2)->e1+e2)
//		.forEach(System.out.println(e1+e2));
		.ifPresent(System.out::println);

	}

}
