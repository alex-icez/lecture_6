package lecture_6;

public class Sample3 {

	static <T> T print(T t) {
		System.out.println(t);
		return t;
	}
	
	public static void main(String[] args) {
		Object s = print("fdesfrde");
		Double d = print(2134213.0);
		Box i = print(new Box(1,2,3));
		
		System.out.println(s);
	}

}
