package Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(24, 56, 87 ,34 ,98);
		System.out.println(numbers);
		List<Integer> result = numbers.stream().filter(n->n<40).map(n-> n+8).toList();
		System.out.println(result);

	}

}
