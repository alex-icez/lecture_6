package lecture_6;

public class Sample3 {

	static Object print(Object t) {
		System.out.println(t);
		return t;
	}
	
	public static void main(String[] args) {
		String s = (String)print("fdesfrde");
		Double d = (Double)print(2134213.0);
		Box b = (Box)print(new Box(1,2,3));
	}

}
