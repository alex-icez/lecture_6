package lecture_6;

import java.util.Arrays;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		int temp, count = 0;
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			temp = s.nextInt();
			if (count == arr.length) 
				arr = Arrays.copyOf(arr, count * 2);
			arr[count] = temp;
			count++;
		}
		arr = Arrays.copyOf(arr, count);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		
		
		
		for(int a : arr)
			System.out.println(a);
	}

}
