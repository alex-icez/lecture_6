package lecture_6;

class Box {
	int w;
	int h;
	int d;
	
	public Box(int w, int h, int d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	public boolean equals(Object obj) {
		
	}
	
}

public class Test {
	public static void main(String args[]) {
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(1,2,3);
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println(b1.equals(b2));
		
		
	}
}
