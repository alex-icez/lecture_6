package lecture_6;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		int temp, count = 0;
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			temp = s.nextInt();
			if (count == arr.length) {
				int newArr[] = new int[count * 2];
				System.arraycopy(arr, 0, newArr, 0, count);
				arr = newArr;
			}
			arr[count] = temp;
			count++;
		}

		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();	
	}

}
