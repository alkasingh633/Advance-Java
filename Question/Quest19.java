package Question;
import java.util.*;
public class Quest19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 5, 20, 8, 15, 3);

        int sum = list.stream()
                      .sorted(Comparator.reverseOrder()) // largest first
                      .skip(2)                           // skip top 2
                      .mapToInt(Integer::intValue)
                      .sum();

        System.out.println("Sum: " + sum);

	}

}
