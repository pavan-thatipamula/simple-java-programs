import java.util.Scanner;
class Atm
{
 int balance=500000,pass=1234;
	String str="";
 public static void main(String args[])
 {
	System.out.println("\n"+"\nwelcome to PAVAN ATM"+"\n");
    Desktop d=new Desktop();
	d.desktop();
 }
}
class Desktop extends Atm
{
	
	public void desktop()
 	{
		System.out.println("INSERT YOUR CARD "+"\n1. YES"+"\n2. NO");
		Scanner sc = new Scanner(System.in);
		int sel=sc.nextInt();
		if(sel==1)
		{
			transactionType();
		} 
		else
		{
			System.out.println(" ATM CARD LEKUNDA ATM KI ENDHUK VACHAV RA"+"\n useless fellow"+"\n ");
		}
	}
	public void transactionType()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" "+" PLEASE SELECT A OPTION "+"\n "+"\n1. WITHDRAW"+"\n2. ATM pin change"+"\n3. Balance enquiry"+"\n4. mini Statement"+"\n5. EXIT");
		int sel=sc.nextInt();	
		if(sel==1)
		{
			withdraw();
		}
		else if(sel==2)
		{
			atmPinchange();
		}
		else if(sel==3)
		{
			balanceEnquiry();
		}
		else if(sel==4)
		{
			miniStatement();
		}
		else
		{
			System.out.println("THANK YOU VISIT AGAIN");	
		}
	}
	public void withdraw()
	{
		int value=super.pass;
		Scanner sc= new Scanner(System.in);
		accounttype();
		System.out.println("please enter pin");
		int pin=sc.nextInt();
		if(pin==value)
		{
			System.out.println(" enter withdraw amount");
			int amount=sc.nextInt();
			if(amount>0)
			{
				str=str+"\t"+amount+"\t"+super.balance+"\n";
			}

				if(amount<=super.balance)
				{
					super.balance=super.balance-amount;
					System.out.println("do you want e-receipt"+"\n1. Yes"+"\n2. go to main menu"+"\n3. exit");
					int nn=sc.nextInt();
		
					if(nn==1)
					{
					System.out.println("\n"+"remaing"+super.balance+"\n ");
					transactionType();
					}
					else if(nn==2)
					{
					transactionType();
					}
					else if(nn==3)
					{
					System.out.println("THANK YOU VISIT AGAIN");
					}	
				}
		
				else
				{
					System.out.println("amount not available");
					transactionType();
					
				}
		}
		else
		{
			System.out.println("WRONG PASSWORD"+"\n1. go back"+"\n2. Exit");
			int pp=sc.nextInt();
			if(pp==1)
			{
				transactionType();
			}
			else
			{
				System.out.println(" can't even remember 4 digit password WASTE FELLOW");
			}
		}
	}
	public void atmPinchange()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mobile number");
		long num=sc.nextLong();
		System.out.println("enter otp");
		int otp=sc.nextInt();
		System.out.println("enter new password");
		super.pass=sc.nextInt();
		transactionType();
	}
	public void balanceEnquiry()
	{
		accounttype();
		System.out.println("AVAILABLE BALANCE IS--------->"+super.balance);
		transactionType();
	}
	public void miniStatement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		int oo=sc.nextInt();
		if(oo==super.pass)
		{
			System.out.println(super.str);
		}
		
	}
	public void accounttype()
	{
		System.out.println("Select account type"+"\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Savings"+"\n2. current"+"\n3. main menu");
		int sel=sc.nextInt();
		if(sel==1)
		{
			
		}
		else if(sel==2)
		{
		
		}
		else
		{
			transactionType();

		}
	
	}
}