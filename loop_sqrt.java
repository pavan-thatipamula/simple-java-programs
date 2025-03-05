// print square root from 1 to 10
class Sqrt
{
public static void main(String args[])
{
	int start=1,end=100;
	while(start<=end)
	{
		int num=start;
		int square=(int)Math.sqrt(num);
		if(square*square==num)
			{
				System.out.println(num);
			}
		start++;
	}
}
}