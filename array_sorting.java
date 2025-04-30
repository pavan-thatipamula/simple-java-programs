class Pavan
{
 public static void main(String args[])
 {
	int a[]={12,13,14187,1};
	int search=1;
	for(int x=0;x<a.length-1;x++)
	{
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]>a[y])
			{
				int t=a[x];
				a[x]=a[y];
				a[y]=t;
			}
		}
	}
	for(int t:a)
	{
		System.out.println(t);
	}
	int f=0,l=a.length,m=(f+l)/2;
	for(int x=0;x<a.length;x++)
	{
		if(m==search)
		{
			System.out.println("found");
		}
		else if(search>m)
		{
			m=
		}
	}
	
 }
}