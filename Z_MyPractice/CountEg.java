package Z_MyPractice;
import java.util.*;
import  java.util.List;
import java.util.stream.Stream;

public class CountEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		long count = list.stream().skip(2).limit(2).count();
		System.out.println(count); 

	}

}
