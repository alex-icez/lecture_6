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

public class Sample2 {

}
