package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class DistinctEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("c++");
		list.add("maths");
		list.add("java");
		list.add("python");
		
		list.stream().distinct().forEach(System.out::println);
				

	}

}
