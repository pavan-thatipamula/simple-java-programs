//Q:ACCEPT MONTH NUMBERS AS INPUT AND PRINT NO OF DAYS IN MONTH

class Month
{
public static void main(String args[])
{
	int month=4;
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	{
		System.out.println(month+"month has 31 days ");
	}
	else if(month==2)
	{
		System.out.println(month+"month has 28/29 days ");	
	}
	else
	{
		System.out.println(month+"month has 30 days ");
	}
}
}