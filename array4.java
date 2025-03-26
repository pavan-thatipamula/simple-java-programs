import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements");
		for(int x=0;x<=a.length-1;x++)
			{
				a[x]=sc.nextInt();
			}
		int b[]=new int[a.length];
	System.out.println("length"+(a.length));
		
		for(int x=a.length-1;x>=0;x--)
			{
				System.out.println(a[x]);
			}
		

		
		
	}
}