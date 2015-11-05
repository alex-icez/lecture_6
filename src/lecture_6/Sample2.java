package lecture_6;


class Pack<T> {
	private T value;
	
	public Pack(T value) {
		this.value = value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
}

class OPack {
	Object value;

	public OPack(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}


public class Sample2 {
	
	static Pair<Integer> sort(Integer a, Integer b) {
	
	
	}
	
	public static void main(String args[]) {
		Pack<Integer> pi = new Pack<Integer>(123);
		Pack<String> ps = new Pack<String>("232");
		
		OPack opi = new OPack(1123);
		OPack ops = new OPack("dsfs");
		String i = (String)opi.getValue();
		opi = ops;
		
	}
}
