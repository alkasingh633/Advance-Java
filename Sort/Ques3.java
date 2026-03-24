package Sort;
import java.util.Arrays;
import java.util.List;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);
		System.out.println(list);
		List<Integer> sortedList = list.stream().sorted((a,b)->b-a).limit(3).toList();
		System.out.println(sortedList);

	}


}
