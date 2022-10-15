package Examples;

public class BoundedTypeParameter {
	public static void main(String[] args) {
		
		Integer[] numbers = {1,2,3};
		Double[] doubleNumbers = {1.0, 2.0, 3.0};

		System.out.println(
				countGreaterThen(numbers, 1)
		);

		System.out.println(
				countGreaterThen(doubleNumbers, 2.0)
		);
	}

	interface A {}
	interface B {}

	// Generic Bounded Type Parameters
	// Multiple Bounded Type Notes
	// In Multiple Bounded Type, Class comes first then interface.
	// In Multiple Bounded Type, We can only extens single class and any number of interfaces.
	// Syntax
	// <T extends Comparable<T> & A & B>
	// <T extends Number & Comparable<T> & A & B>
	// <T extends Number & A>
	// <T extends Number>

	static <T extends Comparable<T>> int countGreaterThen(T[] numbers, T number) {
		int count = 0;
		for (T n: numbers) {
			if (n.compareTo(number) > 0) {
				count++;
			}
		}
		return count;
	}
	
//	static int countGreaterThen(int[] numbers, int number) {
//		int count = 0;
//		for (int n : numbers) {
//			if (n > number) {
//				count++;
//			}
//		}
//		return count;
//	}
}
