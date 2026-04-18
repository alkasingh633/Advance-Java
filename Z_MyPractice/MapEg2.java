package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class MapEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("one", "two", "three", "four", "five");
		
		list.stream()
		.map(s -> s.toUpperCase())
		.forEach(System.out::println);

	}

}
