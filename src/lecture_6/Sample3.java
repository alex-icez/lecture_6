package lecture_6;

interface Output {
	void print();
}


class A {
	class B {
		
		
	}
}



public class Sample3 {

	static <T extends Number & Comparable<T>> T print(T t) {
		System.out.println(t.doubleValue());
		A.B b;
		return t;
	}
	
	public static void main(String[] args) {
		print(3213);
		print(453.0);
		print("edfs");
		
	
		
		//	Double d = print(2134213.0);
	//	Box i = print(new Box(1,2,3));
		
		//System.out.println(s);
	}

}
