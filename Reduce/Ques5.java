package Reduce;
import java.util.Arrays;
import java.util.List;
//longest String
public class Ques5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Stream", "API", "Reduce");
		String longest = list.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Longest String: " + longest);
	}

}
