//Q: if a book is returned before 15 days no charge, after 15days per day 100,
//after month book price should be paid

class Library
{
public static void main(String args[])
{
	int book_price=10000;
	int days=15;
	int penality=days*100;
	if(days<15)
	{
		System.out.println("no penality");
	}
	else if(days<30)
	{
		System.out.println("penality" +penality);
	}
	else
	{
		System.out.println("you shoud pay book price of"+book_price);
	}
}
}