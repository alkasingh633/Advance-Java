package Sort;
import java.util.Arrays;
import java.util.List;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(8,26,13, 41, 19, 32, 5);
		System.out.println(list);
		List<Integer> greater = list.stream().filter(n-> n>20).sorted().toList();
		System.out.println(greater);

	}



}
