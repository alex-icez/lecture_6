package lecture_6;

public class Sample3 {

	static <T> T print() {
		System.out.println();
		return (T)new Integer(1234);
	}
	
	public static void main(String[] args) {
		Integer s = print();

		
		//	Double d = print(2134213.0);
	//	Box i = print(new Box(1,2,3));
		
		System.out.println(s);
	}

}
