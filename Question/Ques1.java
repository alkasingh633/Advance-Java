package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
//Write java program using Stream API filter()  to print all the even number from the list?

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10,15,20,25,30,11,17,16);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(data);
		list.stream().filter(n-> n%2==0).forEach(System.out::println);
		
		

	}

}
