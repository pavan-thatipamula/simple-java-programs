//------------practice question 1-------------------
class cost
{
public static void main(String args[])
{
	int cost_price=1000;
	int selling_price=1100;
	if(selling_price > cost_price)
	{
		int profit=selling_price-cost_price;
		System.out.println("sellar made profit of " + profit);
	}
	else
	{
		int loss=cost_price-selling_price;
		System.out.println("sellar made loss of " + loss);
	}
}
}

//-----------practice question 2----------------------

class Area
{
public static void main(String args[])
{
	int length=5;
	int breadth = 4;
	int area=length*breadth;
	System.out.println("area is " + area);
}
} 