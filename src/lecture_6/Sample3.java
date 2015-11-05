package lecture_6;

public class Sample3 {

	static <T> T print(T t) {
		System.out.println(t);
		return t;
	}
	
	public static void main(String[] args) {
		print("fdesfrde");
		print(2134213.0);
		print(new Box(1,2,3));
	}

}
