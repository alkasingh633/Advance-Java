package Reduce;
import java.util.*;

public class Ques6 {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

    int sum = list.stream().reduce(0, Integer::sum);
    double avg = (double) sum / list.size();

    System.out.println("Average: " + avg);
	}

}
