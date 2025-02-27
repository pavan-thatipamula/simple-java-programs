class AGE
{
public static void main(String args[])
{
	int age =75;
	if(age>60)
		{
			String gender="male";
			if(gender=="female")
				{
					System.out.println("retirement amout is 30k because you are female and senior citizen");
				}
			else
				{
					System.out.println("retirement amout is 35k because you are male and senior citizen");
				}		
		}
	else if(age>18)
		{
			String graduation="ug";
			if(graduation=="ug")
				{
					System.out.println("scholarship amount is 30k because you are a under graduate");
				}
			else if(graduation=="pg")
				{
					System.out.println("scholarship amount is 35k because you are a post graduate");
				}
			else 
				{
					System.out.println("scholarship amount is 30k because you are not a graduate");
				}
		}
	else	
		{
			System.out.println("he/she is neither eligible for scholarship nor retirement amout becaue he is minor");
		}
}

}
//---------method 2-------------------
class Ageint
{
public static void main(String args[])
{
	int age =18;
	String gender="female";
	String graduation="pg";
	String res=((age>60)?(gender=="female")? "retirement 30k you are senior citizen and female":"retirement 35k you are senior citizen and male":(age>=18)?(graduation=="ug")?"scholarship is 30k ":(graduation=="pg")? "scholarship is 40k":"20k not graduate":"not eligible");
		System.out.println(res);
}
}









