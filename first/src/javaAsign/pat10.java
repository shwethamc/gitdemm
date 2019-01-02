package javaAsign;
/*
 *       1
 *     1 2 1
 *   1 2 3 2 1
 * 1 2 3 4 3 2 1
 * 
 * 
 * 
 */
public class pat10 {
public static void main(String[] args) {
	int n=4;int space=3;
	for (int i = 0; i < n; i++)
	{
		for(int j=space;j>0;j--)
		{
			System.out.print(" ");
		}
		int l=(i*2)+1;int k=1;
		for (int j = 0; j < l; j++) 
		{
			
			if(j<l/2)
			{
			System.out.print(k);
			k=k+1;}
			else
			{
				System.out.print(k);
				k=k-1;
			}
			
		}
		space--;
		System.out.println();
	}
}
}



