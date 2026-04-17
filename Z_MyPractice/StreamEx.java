package Z_MyPractice;
import java.util.*;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.stream().filter(e -> e>10).forEach(System.out::println);

	}

}
