package Question;
import java.util.*;

public class Quest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> list = Arrays.asList(8, 3, 15, 1, 10, 5);

	        Optional<Integer> result = list.stream()
	                                      .sorted()        
	                                      .skip(2)        
	                                      .min(Integer::compareTo); 

	        result.ifPresentOrElse(
	            val -> System.out.println("Result: " + val),
	            () -> System.out.println("No value found")
	        );

	}

}
