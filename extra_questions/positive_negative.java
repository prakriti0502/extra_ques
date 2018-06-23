package extra_questions;
import java.util.Scanner;
public class positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n>0) {
			System.out.println("The number entered is positive");
		}
		else if(n<0)
		{
			System.out.println("The number entered is negative");
		}
		else if(n==0)
		{
			System.out.println("The number entered is Zero");
		}
	}

}
