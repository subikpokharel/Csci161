
public class DoublyLinkedList {

	private static Link head = null;
	private static int size = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFront(10);
		print();
		System.out.println("--------------------");
		addFront(5);
		print();
		System.out.println("--------------------");
		addRear(22);
		print();
		System.out.println("--------------------");
		addRear(2);
		print();
		
	}
	
	
	public static void addFront(int data) {
		
		if (head == null)
			head = new  Link( data);
		else {
			Link newLink = new Link (null, data, head);
			head.previous = newLink;
			head = newLink;
		}
		size++;
	}
	
	public static void addRear(int data) {
		if(head == null)
			head = new Link(data);
		else {
			Link current = head;
			while(current.next != null) {
				current = current.next;
			}
			
			Link newLink = new Link(current, data, null);
			current.next = newLink;
		}
		size++;
	}
	
	
	public static void removeFront() {
		if(head == null)
			return;
		head = head.next;
		head.previous = null;
		size--;
	}
	
	public static void removeRear() {
		if(head == null)
			return;
		if (head.next == null) {
			head = null;
			size --;
			return;
		}
		Link current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		size--;
			
	}
	
	
	public static void insertAt(int data, int index) {
		if (head == null)
			return;
		if(index<1 || index>size)
			return;
		Link current = head;
		int i = 1;
		while (i<index) {
			current = current.next;
			i++;
		}
		if(current.previous == null) {	//If the first node
			Link newLink = new Link(null, data, current);
			current.previous = newLink;
			head = newLink;
		}else {
			Link newLink = new Link(current.previous, data, current);
			current.previous.next = newLink;
			current.previous = newLink;
		}
		size++;
					
	}
	
	public static void removeAt(int index) {
		
		if (head == null)
			return;
		if(index<1 || index>size)
			return;
		Link current = head;
		int i = 1;
		while (i<index) {
			current = current.next;
			i++;
		}
		
		if(current.next == null) //i.e. the last node
				current.previous.next = null;
		
		else if(current.previous == null) { //i.e. the first node
			current = current.next;
			current.previous = null;
			head = current;
		}else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void print() {
		Link current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
	
	
	

}
