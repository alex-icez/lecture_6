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
				for(int i = 0; i < count; i++)
					newArr[i] = arr[i];
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
