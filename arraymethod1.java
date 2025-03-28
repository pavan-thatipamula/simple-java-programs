import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
         Main main = new Main();
         int a[]= new int[]{10,20,30,40,50};
         main.array(a);
   
   }
    void array(int a[])
    {
        
        for(int x=0;x<a.length;x++)
        {
            System.out.println(a[x]);
        }
    }
}