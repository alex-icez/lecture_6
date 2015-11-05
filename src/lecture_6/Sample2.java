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

class Pair<T> {
	T first;
	T second;
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
}

class PairInteger {
	Integer first;
	Integer second;
	public PairInteger(Integer first, Integer second) {
		this.first = first;
		this.second = second;
	}
}

public class Sample2 {
	
	static Pair<Integer> sort(Integer a, Integer b) {
		if (a > b)
			return new Pair<>(a, b);
		return new Pair<>(b, a);
	}
	
	static Pair<String> sort(String a, String b) {
		if (a.compareTo(b) > 0)
			return new Pair<>(a, b);
		return new Pair<>(b, a);
	}
	
	
	public static void main(String args[]) {
		Pair<Integer> r = sort(100, 12);
		
		
		Pack<Integer> pi = new Pack<>(123);
		Pack<String> ps = new Pack<>("232");
		
		OPack opi = new OPack(1123);
		OPack ops = new OPack("dsfs");
		String i = (String)opi.getValue();
		opi = ops;
		
	}
}
