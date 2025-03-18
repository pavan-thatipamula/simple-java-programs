class Check
{
 public static void main(String args[])
 {
     for(int x=1;x<=10;x++)
    {
	int num=x,count=0,temp=num,sum=0,rem=0;
       while(num!=0)
       {
          rem=num%10;
          count++;
	    	num=num/10;
       }
      num=temp;
      while(num!=0)
      {
        rem=num%10;
        sum=sum+(int)Math.pow(rem,count);
        num=num/10;
      }
   
     if(temp==sum)
      {
         System.out.println(temp+" is a armstrong "+sum);
      }
     else
       {
          System.out.println(temp+" is not a armstrong "+sum);
       }
     }  
  }
}