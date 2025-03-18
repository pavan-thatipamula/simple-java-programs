class Loop
{
public static void main(String args[])
{
	for(int x=1;x<=10;x++)
	{
		int num=x,pro=1;
		for(int start=1;start<=10;start++)
		{
			pro=num*start;
			System.out.println(num+"x"+start+"="+pro);
		}
	}
}
}