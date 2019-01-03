package javaAsign;
import java.util.Scanner;

// 1 2  2 2 3 2 4 2 ...
/*public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=2;
  for (int i = 1; i < 15; i++) {
	  System.out.print(i+"2");
	
}
	}

}
*/

//0 1 1 2 3 5 8 13 21
/*public class num1 {

	public static void main(String[] args) {
int num1=0;
int num2=1;
System.out.print(num1+" "+num2);

int sum=num1+num2;
while(sum<100)
{
	num1=num2;
	num2=sum;
	sum=num1+num2;
	System.out.println(sum);
	
}
	}
}*/



//wap to find odd nos from 1 to n
/*public class num1 {

	public static void main(String[] args) {
for(int i=0;i<100;i++)
{
	if(i%2!=0)
	{
		System.out.println(i);
	}
}
	}
}

*/
//wap to find odd nos from 1 to n
/*public class num1 {

	public static void main(String[] args) {
for(int i=0;i<100;i++)
{
	if(i%2==0)
	{
		System.out.println(i);
	}
}
	}
}*/

//wap to find whether given no is prime or not

/*public class num1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int numb=sc.nextInt();
for(int i=0;i<numb;i++)
{
if(numb%2==0)
{
	System.out.println("it is not prime");
	break;
}
else
{
	System.out.println("it is a prime no");
}
		
	}
}
	}
*/

//wap to find whether given no is prime or not in given range
/*public class num1 {

	public static void main(String[] args) {
		
		boolean flag=true;
		int i;int j;
		for(i = 1; i <= 100; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }
            }
            if(flag == true)
            {
                System.out.println(i);
            }
        }
	
	}

	}

*/


//print multiplication table of 5
public class num1 {

	public static void main(String[] args) {
//int numb=10;
for(int numb=1;numb<=10;numb++)
{
for(int i=1;i<=10;i++)
{
	System.out.print(i+"*"+numb+"="+numb*i+" ");
}
System.out.println();
		
}		
		
		
	}
}

//largest of three no
/*public class num1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a> c )
	{
		System.out.println(a +"is largest");
	}
	else if(b>a && b>c)
	{
		System.out.println(b+"is largest");
	}
	else 
	{
		System.out.println(c +"is largest");
	}
}

}
*/


//factorial of a numb
/*public class num1 {
public static void main(String[] args) {

    int num = 4;
    long factorial = 1;
    for(int i = 1; i <= num; ++i)
    {
        factorial = factorial * i;
       
    }
    System.out.printf("Factorial of %d = %d", num, factorial);
}
}*/


/*public class num1 {
public static void main(String[] args) {

	int numb=5;
	System.out.println(fact(numb));
	
}
static int fact(int numb)
{
	
if(numb==0)
{
	return 1;
}
else
{
	return numb*fact(numb-1);
}
	
	
	
	
}
}
*/