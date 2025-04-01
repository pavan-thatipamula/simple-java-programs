/*class Main
{
 	public static void main(String args[])
	{
		Main m=new Main();
		m.amstrong(6,0,0);
	}
	//int sum,temp;
	void amstrong(int num,int count,int sum)
	{
		int temp=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		while(num!=0)
		{
			int rem=num%10;
			int pow=(int)Math.pow(rem,count);
			sum=sum+pow;
			num=num/10;
		}
		System.out.println(sum==temp?"amstrong":"not amstrong");
	}
}*/

import java.util.Scanner;
class pavan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nums[]={3,2,4};
        int target=sc.nextInt();
        for(int x=0;x<nums.length;x++)
        {
            for(int y=1;y<nums.length;y++)
            {
            if(nums[x]+nums[y]==target)
            {
                System.out.println("["+x+","+y+"]");
				break;
            }
            }
        }
    }
}