import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class Check
{
 public static void main(String args[]) throws FileNotFoundException
{
	File f=new File("//Users//pavankumarthatipamula//Desktop//pavan2//sample.txt");
	Scanner sc=new Scanner(f);
	while(sc.hasNextLine())
	{
		System.out.println(sc.nextLine());
	}
}

}