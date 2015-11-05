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
		return w * h * d - o.w * o.h * o.d;
	}
}

public class Test {
	
	
	static <T extends Comparable<T>> void sort(T arr[]) {
		T temp;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}	
	}
	
	public static void main(String args[]) {
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(1,2,3);
		System.out.println(b1);
	
		
		
	}
}
