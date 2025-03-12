class Square
{
public static void main(String args[])
{
	int start=1,end=500,count=0,sum=0;
		while(start<=end)
			{
				int num=start;
				int square=(int)Math.sqrt(num);
				if(square*square==num)
					{
					System.out.println(num+" is perfect square");
					count++;
					sum=sum+num;
					}
				start++;
			}
			

			System.out.println(count+" total no of perfect square");
			System.out.println(sum+" sum of perfect square");
}
}