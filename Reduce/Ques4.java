package Reduce;

import java.util.Arrays;
import java.util.List;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12, 45, 67, 23, 89, 34, 78);
		int max = list.stream().reduce(0, (a,b)-> a>b ? a:b);
		
		int Smax = list.stream().reduce(0, (a,b)-> a>b && a<max?a:b);
		System.out.println(Smax);

	}

}
