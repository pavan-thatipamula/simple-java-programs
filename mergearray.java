import java.util.Scanner;
class Array
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[]={10,20,30,40};
	int b[]={50,60,70};
	int csize=a.length+b.length;
	int c[]=new int[csize];

	for(int x=0;x<=a.length-1;x++)
		{
			c[x]=a[x];
		}
	
	for(int x=0;x<=b.length-1;x++)
		{
			int r =a.length+x;
			c[r]=b[x];
		}

	for(int x=0;x<=c.length;x++)
		{
			System.out.println(c[x]);
		}
}
}