package p2;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Stream;
	import java.util.function.Predicate;


	public class A1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> list = new ArrayList<Integer>();
			list.add(23);
			list.add(45);
			list.addAll(List.of(23,34,56,78,65));
			System.out.println(list);
//			Stream listStream = list.stream();
			list.stream().filter(n->n>60).forEach((element)-> System.out.println(element));
			list.stream().forEach((element)->System.out.print(element + " "));
			list.stream().forEach(System.out::println);
			System.out.println("count =" +list.stream().filter((iteam)->iteam>60).count());
			

		

	}

}
