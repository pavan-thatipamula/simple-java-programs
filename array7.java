class Array
{
public static void main(String args[])
{
	int max=Integer.MIN_VALUE;
 int a[]={12,13,14,262,29};
	int z=0;
	int swap=a[0];
	for(int x=0;x<a.length;x++)
	{
		if(a[x]>max)
		{
			max=a[x];
			z=x;
		}
	}
	System.out.println(max+" is max value and its position is "+z);
	a[0]=max;
	a[z]=swap;
	for(int x=0;x<a.length;x++)
	{
		System.out.println(a[x]);
	}
}
}