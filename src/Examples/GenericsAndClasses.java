package Examples;

public class GenericsAndClasses {
	public static void main(String[] args) {
		Box<Phone> phoneInBox = new Box<>();
		phoneInBox.set(new Phone("Samsung"));
		
		Box<Letter> letterInBox = new Box<>();
		letterInBox.set(new Letter("Trash"));

		System.out.println(phoneInBox.get());
		System.out.println(letterInBox.get());
	}
}
