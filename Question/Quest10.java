package Question;
import java.util.*;
import java.util.Collection;
import java.util.Comparator;
//import java.util.Collectors;

public class Quest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2, 5, 8, 3, 10, 6);

        List<Integer> result = list.stream()
                                  .map(n -> n * n)              // square
                                  .sorted(Comparator.reverseOrder()) // descending
                                  .limit(4)                     // top 4
                                  .collect(Collectors.toList());

        System.out.println(result);

	}

}
