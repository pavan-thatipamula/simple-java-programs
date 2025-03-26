import java.util.Scanner;
class Array
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int a[]=new int[sc.nextInt()];
	int sum=0;
	for(int x=0;x<=a.length-1;x++)
	{
		a[x]=sc.nextInt();
		sum=sum+a[x];
	}
	System.out.println("sum of elements are "+sum);


}
}