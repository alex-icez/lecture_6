package lecture_6;

interface List<T> {
	void add(T value);
	void set(int index, T value);
	void get(int index);
	int size();
	boolean isEmpty();
	void print();
}

class LinkedList<T> implements List<T> {
	private class Item {
		T value;
		Item next;
		public Item(T value) {
			this.value = value;
		}
	}

	private Item head = null;
	private int size = 0;
	
	public void add(T value) {
		size++;
		if (head == null) {
			head = new Item(value);
			return;
		}
		Item iter = head;
		while(iter.next != null) 
			iter = iter.next;
		
		iter.next = new Item(value);
	}
	
	public void print() {
		Item iter = head;
		while(iter != null) {
			System.out.print(iter.value + " ");
			
		}
	}
}


public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
