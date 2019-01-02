package javaAsign;
/*
 *        1
 *      2 2 2
 *    3 3 3 3 3
 *   4 4 4 4 4 4 4
 * 
 * 
 * 
 * 
 * 
 */
public class pat9 {
public static void main(String[] args) {
	int n=4;int space=3;
	for (int i = 0; i < n; i++)
	{
		for(int k=space;k>0;k--)
		{
			System.out.print(" ");
		}
		for (int j = 0; j < (i*2)+1; j++) 
		{
			System.out.print(i+1);
			
		}
		space--;
		System.out.println();
	}
}
}
