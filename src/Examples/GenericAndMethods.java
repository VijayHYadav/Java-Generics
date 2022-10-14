package Examples;

public class GenericAndMethods {
	public static void main(String[] args) {
		String[] names = {"Ali", "Jamila"};
		// Generics doesn't work with primitive types char,double,int etc
		char[] letters = {'A', 'B', 'C'}; 
		Character[] chars = {'A', 'B', 'C'};
		Integer[] numbers = {1,2,3};
		
		print(names);
		print(chars);
		print(numbers);
	}
	
// Method With Generic	
	// static <T> T print(T[] array) { you can also return Generic type.
	static <T> void print(T[] array) {
		for (T e: array) {
			System.out.println(
					e.getClass().getName() + " - " + e
					);
		}
	}

// Method WithOut Generic
//	static void print(String[] array) {
//		for (String e: array) {
//			System.out.println(
//					e.getClass().getName() + " - " + e
//					);
//		}
//	}
}
