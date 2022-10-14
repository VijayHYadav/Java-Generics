package Examples;

// T => T could be anything, T stands for type.
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}