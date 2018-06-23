package extra_questions;
import java.util.Scanner;
import java.lang.Math;
public class armstrong_numbersinrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int temp1=0,temp2=0,count=0,sum=0,r;
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			count = 0;
			sum=0;
			temp1=i;
			temp2=i;
			while(temp1>0)
			{
				r=temp1%10;
				count++;
				temp1/=10;
			}
			while(temp2>0)
			{
				r=temp2%10;
				sum+=(int)Math.pow(r, count);
				temp2/=10;
			}
			//System.out.println(sum);
			if(sum==i)
				System.out.println(i);
		}
	}

}
