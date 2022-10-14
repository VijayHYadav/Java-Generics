package Examples;

public class Letter {
	private String sender;
	
	Letter (String sender) {
		this.sender = sender;
	}
	
	public String getSender() {
		return sender;
	}

	@Override
	public String toString() {
		return "Letter [sender=" + sender + ", getSender()=" + getSender() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
