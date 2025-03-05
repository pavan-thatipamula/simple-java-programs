class Loop
{
	public static void main(String args[])
{
	int start=100,end=1000;
	while(start<=end)
	{
		int res=start/10;
		System.out.println(res + " is last digit");
		start++;
	}
}
}