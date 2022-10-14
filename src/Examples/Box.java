package Examples;

// T => T could be anything, T stands for type.
// Public class Box<T, K, P, C> { You can add many as you want.
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}

	@Override
	public String toString() {
		return "Box [t=" + t + ", get()=" + get() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}