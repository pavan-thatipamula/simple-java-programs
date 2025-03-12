class Extraction
{
public static void main(String args[])
{
	int num=1222,rem=0,rev1=0,rev2=0,count1=0,count2=0,temp=num;
	while(num!=0)
	{
		rem=num%10;
		count1++;
		rev1=rev1*10+rem;
		num=num/10;
	}
		System.out.println(temp+" actual num");
		System.out.println(rev1+" reverse");
	while(rev1!=0)
	{
		rem=rev1%10;
		count2++;
		rev2=rev2*10+rem;
		rev1=rev1/10;
	}
		System.out.println(rev2+" reverse of reverse");
		
		if(count1==count2)
			System.out.println(temp+" by reversing they are equal ");
		else
			{
				int value=count1-count2;
				int pow=(int)Math.pow(10,value);
				System.out.println(rev2*pow+" after equaling");
			}
}
}