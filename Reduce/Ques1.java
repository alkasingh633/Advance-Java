package Reduce;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 30);

        // Using reduce to find maximum
        Optional<Integer> max = numbers.stream()
                                       .reduce((a, b) -> a > b ? a : b);

        // Display result
        if (max.isPresent()) {
            System.out.println("Maximum number: " + max.get());
        } else {
            System.out.println("List is empty");
        }
	}

}
