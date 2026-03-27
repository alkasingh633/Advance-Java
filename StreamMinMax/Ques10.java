package StreamMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Ques10 {
	 public static void main(String[] args) {
		 
		 ArrayList<Integer> list = new ArrayList<>(
	                Arrays.asList(10, 20, 20, 30, 40, 40, 50));
		 Optional<Integer> maxValue = list.stream()
                 .distinct()
                 .max(Integer::compareTo);
		  // Step 3: Print result
	        if (maxValue.isPresent()) {
	            System.out.println("Maximum value after removing duplicates: " + maxValue.get());
	        } else {
	            System.out.println("List is empty");
	        }
	 }
}
