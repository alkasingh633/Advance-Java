package Reduce;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> list = Arrays.asList(10, 25, 5, 40, 30);
	    int max = list.stream().reduce(Integer::max).get();
	    System.out.println(max);

        // Using reduce to find maximum
//        Optional<Integer> max = numbers.stream()
//                                       .reduce((a, b) -> a > b ? a : b);

        // Display result
//        if (max.isPresent()) {
//            System.out.println("Maximum number: " + max.get());
//        } else {
//            System.out.println("List is empty");
//        }
	}

}
