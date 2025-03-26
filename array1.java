import java.util.Scanner;
class Array
{
 public static void main(String args[])
 {
	System.out.println("enter elements");
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	int size=arr.length;
	for(int x=0;x<=size-1;x++)
	{
		arr[x]=sc.nextInt();
	}
	System.out.println(" elements are");
	for(int x=0;x<=size-1;x++)
	{
		System.out.println(arr[x]);
	}
 }
}