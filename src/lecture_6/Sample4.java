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

	@Override
	public void add(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	
	
}


public class Sample4 {

	public static void main(String[] args) {
		

	}

}
