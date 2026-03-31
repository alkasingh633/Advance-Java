package Question;
import java.util.*;

public class Quest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(2, 25, 31, 18, 41, 7, 22);

	        Optional<Integer> result = list.stream()
	                                      .filter(n -> n > 20 && n % 2 != 0) 
	                                      .min(Integer::compareTo);           

	        result.ifPresentOrElse(
	            val -> System.out.println("Result: " + val),
	            () -> System.out.println("No such number found")
	        );

	}

}
