package Examples;

public class Phone {
	private final String brand;

	public Phone(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", getBrand()=" + getBrand() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
