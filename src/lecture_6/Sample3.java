package lecture_6;

public class Sample3 {

	static <T> T print(T t) {
		System.out.println(t);
		return t;
	}
	
	public static void main(String[] args) {
		String s = print("fdesfrde");
		Double d = print(2134213.0);
		Box i = print(new Box(1,2,3));
	}

}
