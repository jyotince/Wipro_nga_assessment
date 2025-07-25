package classPractice;

import java.util.Scanner;

public class Avg_min_max_array {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[10];
		
		for(int i =0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i =0 ; i<10; i++)
		{
			sum=sum+ arr[i];
		}
		System.out.println("Average: "+ (sum/10));
		
		
		int max1 = arr[0];
		for(int i=0; i<10; i++)
		{
			if(arr[i]>max1)
			{
				max1 = arr[i];
			}
		}
		System.out.println("Maximum: "+ max1);
		
		int min1 = arr[0];
		for(int i=0; i<10; i++)
		{
			if(arr[i]<min1)
			{
				min1 = arr[i];
			}
		}
		System.out.println("Minimum: "+ min1);

		sc.close();
	}
}
