class Array
{
public static void main(String args[])
{
 int  a[]={1,2,3,4,5,5,6,7,8,8,9,8};
	int b[];
	int y=0,z=0;
	for(int x=0;x<a.length;x++)
	{
		if(x%2==0)
		{
			b[y]=a[x];
			y++;
		}
	
		
	}
	for(int x=0;x<b.length;x++)
		{
			System.out.println(b[x]+" "+x);
		}

}
}