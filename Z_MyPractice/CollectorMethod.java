package Z_MyPractice;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1, "Apple Mobile", 25000f));
		productsList.add(new Product(2, "OnePlus Mobile", 30000f));
		productsList.add(new Product(3, "Redmi Mobile", 28000f));
		productsList.add(new Product(4, "Vivo Mobile", 28000f));
		
		List<Float> priceList=productsList.stream().map(p->p.price).collect(Collectors.toList());
			
		priceList.forEach(System.out::println);

	}

}
