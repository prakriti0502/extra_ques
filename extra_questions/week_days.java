package extra_questions;
import java.util.Scanner;
public class week_days {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-7 to find the week day");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		switch(n)
		{
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Sunday");
			break;
		}
		}
	}

}
