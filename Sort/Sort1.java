package Sort;

import java.util.Arrays;
import java.util.List;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(23, 12, 1,45,23,45,76);
		System.out.println(list);
		List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();
		System.out.println(sortedList);
	}

}
