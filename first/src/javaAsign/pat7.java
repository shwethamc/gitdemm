package javaAsign;
/*
 * 1 2 3 4
 *  5 6 7
 *   8 9 
 *    10
 * 
 * 
 * 
 */
public class pat7{
public static void main(String[] args) {
	int n=5;int space=0;int k=1,ch=4;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<space;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<ch;j++)
		{
			System.out.print(k++ +" ");
		}
		space++;ch--;
		System.out.println();
	}
}
}