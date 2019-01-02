package javaAsign;
/*
 *    1
 *  2 3
 * 4 5 6
 *7 8 9 10 
 * 
 * 
 * 
 */
public class pat5{
public static void main(String[] args) {
	int n=5;int space=3;int k=1;
	for(int i=0;i<n;i++)
	{
		for(int j=space;j>=0;j--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<i;j++)
		{
			System.out.print(k++ +" ");
		}
		space--;
		System.out.println();
	}
}
}