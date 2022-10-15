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

	// Generic Bounded Type Parameters
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
