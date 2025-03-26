import java.util.Scanner;
class Array
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter array elements");
	for(int x=0;x<=a.length-1;x++)
	{
		a[x]=sc.nextInt();
	}
	int b[]=new int[a.length];
	for(int x=0;x<=a.length-1;x++)
	{
		b[x]=a[x];
	}
	System.out.println("a elements are");
	for(int x=0;x<=a.length-1;x++)
	{
		System.out.println("a["+x+"]= "+a[x]);
	}
	for(int x=0;x<=a.length-1;x++)
	{
		System.out.println("b["+x+"]= "+b[x]);
	}
	
}
}