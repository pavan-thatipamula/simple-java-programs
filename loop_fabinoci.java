class Fabino
{
public static void main(String args[])
{
	int a=0,b=1,c=0,n=4,start=1;
	while (start<=n-2)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(start+" " +c);
	start++;
	}
}
}