package Question;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10,60,45,90,30,24,50,76);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(data);
		list.stream().filter(n->n>=60&& n<=60).forEach((n)->System.out.println(n+" "));
		System.out.println();

	}

}
