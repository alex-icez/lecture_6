package lecture_6;

class Box implements Comparable<Box> {
	int w;
	int h;
	int d;
	
	public Box(int w, int h, int d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Box))
			return false;
		Box box = (Box)obj;
		return w == box.w && h == box.h && d == box.d; 
	}
	
	public String toString() {
		return "Box " + h + "x" + w + "x" + d;
	}

	public int compareTo(Box o) {
		if (w != o.w) 
			return w - o.w;
		if (h != o.h)
			return h - o.h;
		return d - o.d;
	}
}

public class Test {
	public static void main(String args[]) {
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(1,2,3);
		System.out.println(b1);
		
		
	}
}
