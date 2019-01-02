package first;

import java.util.Scanner;

public class AverageofFirstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int sum=0;
		int[] a=new int[size];
		System.out.println("Enter the "+size+" elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		} 
		int count=0;
		for(int i=0;i<size/2;i++)
		{
			System.out.println(a[i]);
		
		}
		for(int i=0;i<size/2;i++)
		{
			sum=sum+a[i];
			count++;
			
		}
		System.out.println("Min value from the first half "+sum);
		int average=sum/count;
		System.out.println("Average is "+average);


	}


	

}
