package lecture_6;

public class Sample3 {

	static <T> T print() {
		System.out.println();
		return (T)"dsqedq";
	}
	
	public static void main(String[] args) {
		String s = print();

		
		//	Double d = print(2134213.0);
	//	Box i = print(new Box(1,2,3));
		
		System.out.println(s);
	}

}
