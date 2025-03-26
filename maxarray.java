class Array
{
 public static void main(String args[])
 {
	int a[]={1,2,3,0};
	int max1=Integer.MIN_VALUE,max2=max1;
	
	for(int x=0;x<=a.length-1;x++)
	{
		
		if(a[x]>max1)
		{
			max1=a[x];
		}

	}
	System.out.println(max1);
 }
}