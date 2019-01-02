package javaAsign;
/*
 * 10 9 8 7
 *   6 5 4 
 *    3 2 
 *     1
 * 
 * 
 * 
 */
public class pat6{
public static void main(String[] args) {
	int n=5;int space=0;int k=10,ch=4;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<space;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<ch;j++)
		{
			System.out.print(k-- +" ");
		}
		space++;ch--;
		System.out.println();
	}
}
}