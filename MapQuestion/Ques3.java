package MapQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> values = Arrays.asList("A","B","C");
		System.out.println(values);
		List<String> result = values.stream()
				.map(item-> "Item -"+ item)
				.toList();
//		.collect(CollectorstoList());
		System.out.println(result);

	}

}


