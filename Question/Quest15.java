package Question;
import java.util.*;

public class Quest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2, 7, 5, 8, 3, 10);

        Optional<Integer> result = list.stream()
                                      .filter(n -> n % 2 != 0)   
                                      .map(n -> n * n)           
                                      .max(Integer::compareTo);  

        result.ifPresentOrElse(
            val -> System.out.println("Max Square: " + val),
            () -> System.out.println("No odd numbers found")
        );

	}

}
