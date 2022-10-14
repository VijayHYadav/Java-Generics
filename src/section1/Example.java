package section1;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		
//		WithOut Generics
//		List numbers = new ArrayList();
//		numbers.add(1);
//		numbers.add("2");
//		for (Object number: numbers) {
//			System.out.println((Integer)number);
//		}
		
//		With Generics
		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		
		for (Object number: numbers) {
			System.out.println((Integer)number);
		}
	}
}
