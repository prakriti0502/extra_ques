package extra_questions;
import java.util.Scanner;
public class Quadratic_equations {

	public static void main(String[] args) {
		System.out.println("Enter a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		sc.close();
		double x1,x2,d;
		System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = (b * b) - (4 * a * c);
        if(d>0)
        {
        	System.out.println("Roots are real and unequal");
        	x1 = ( - b + Math.sqrt(d) ) / ( 2 * a );
        	x2 = ( - b + Math.sqrt(d) ) / ( 2 * a );
        	System.out.println("First Root is: " + x1);
        	System.out.println("Second root is: " + x2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            x1 = ( - b + Math.sqrt(d) ) / ( 2 * a );
            System.out.println("Root is:" + x1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
	}
}
