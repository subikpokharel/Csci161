
public class Link {
	
	private int data;
	Link next;
	Link previous;
	
	
	public Link(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}


	public Link( Link previous, int data, Link next) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	public int getData() {
		return this.data;
	}
	
	
	
	
	
}
