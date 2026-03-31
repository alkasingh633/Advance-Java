package Question;
import java.util.*;


public class Quest1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//		System.out.println(list);
		int sum = list.stream()
                .filter(n -> n >= 10 && n <= 40) // range condition
                .mapToInt(Integer::intValue)
                .sum();

  System.out.println("Sum: " + sum);
	}

}
