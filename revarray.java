class Array
{
 public static void main(String args[])
 {
	int a[]={10,20,30,40};
	int b[]=new int[a.length];
	for(int x=a.length-1,y=0;x>=0;x--,y++)
	{
		b[y]=a[x];
	}
	for(int x=0;x<=b.length-1;x++)
	{
		System.out.println(b[x]);
	}
 }
}