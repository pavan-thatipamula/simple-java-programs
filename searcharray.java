class Array
{
 public static void main(String args[])
 {
	int a[]={1,2,3,4,5,6};
	int search=7;
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]==search)
		{
			System.out.println("element found "+a[x]);
		}
	}
 }
}