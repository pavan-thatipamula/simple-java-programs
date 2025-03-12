class Main
{
public static void main(String[] args)
{
	int start=1,end=10;
	while(start<=end)
		{
			if(start==5)
				{
					//break;
					continue;
				}
			System.out.println(start);
			start++;
		}
}
}