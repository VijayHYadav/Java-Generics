package section1;

public class Example2 {

	public static void main(String[] args) {
//		Comparable number = 10;
//		number.compareTo("10");
		
		Comparable<Integer> number = 10;
		System.out.println(number.compareTo(10));
		System.out.println(number.compareTo(11));
		System.out.println(number.compareTo(12));
	}

}
