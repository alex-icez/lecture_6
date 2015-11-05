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
	private static class Item {
		T value;
		Item next;
		public Item(T value) {
			this.value = value;
		}
	}

	
	
}


public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
