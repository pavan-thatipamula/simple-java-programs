class Array
{
 public static void main(String args[])
 { 
	int min=Integer.MAX_VALUE,min2=min;
	int a[]={1,2,3,4,56765,-1};
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]<min)
		{
			min=a[x];
		}
		if(a[x]<min2 && a[x]!=min)
		{
			min2=a[x];
		}
	}
	System.out.println(min2);
 }
}