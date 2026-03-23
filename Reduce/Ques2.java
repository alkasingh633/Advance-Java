package Reduce;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 25, 5, 40, 30);
		int count = list.stream().reduce(0,(a,b)->a+1);
		System.out.print(count);

	}

}
