package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class MapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
		.map(n -> n*10)
		.forEach(System.out::println);
		

	}

}
