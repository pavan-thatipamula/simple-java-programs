import java.util.Scanner;
class Array
{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size of array");
	int a[]=new int[sc.nextInt()];
	for(int x=0;x<=a.length-1;x++)
	{
		a[x]=sc.nextInt();
	}
	System.out.println("even array elements are");
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]%2==0)
		{
			System.out.println(a[x]);
		}
	}
}
}