import java.util.Scanner;
class Array
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter arrey size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter arrey elements");
	for(int x=0;x<=a.length-1;x++)
	{
		a[x]=sc.nextInt();
	}
	int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
	{
		b[x]=a[x];
	}
	System.out.println("b array elements");

	for(int x=0;x<=a.length-1;x++)
		{
		System.out.println(b[x]);
	}
	}
	
}