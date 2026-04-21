package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Reduce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("code", "block");
		
		list.stream()
		.reduce((e1,e2)->e1.concat(e2))
		.ifPresent(System.out::println);

	}

}
