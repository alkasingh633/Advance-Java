package Sort;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12, 5, 33, 9, 21, 1, 45, 67, 4, 89);
		System.out.println(list);
		Integer second = list.stream()
				.sorted(Comparator.reverseOrder())
				.toList().get(1);
		
		System.out.println(second);

	}



}
