package Reduce;

import java.util.Arrays;
import java.util.List;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Stream", "API", "Reduce");
		String finalList = list.stream().reduce(" ",(a,b)->a+" "+b);
		System.out.println(finalList);

	}

}
