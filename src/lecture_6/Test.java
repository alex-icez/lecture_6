package lecture_6;

import java.util.Arrays;

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
		String arr[] = {"a", "ab", "bb","ba", "bb", "aa", "ba"};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
