class Even
{
public static void main(String args[])
{
	int start=1,end=10;
	while(start<=end)
		{
			int num =start;
		if(num%2==0)
			System.out.println(num);
		start++;
		}
	start=1,end=10;
	while(start<=end)
		{
			int num =start;
		if(num%2!=0)
			System.out.println(num);
		start++;
		}

}
}