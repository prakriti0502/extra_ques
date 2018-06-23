package extra_questions;

public class pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<2*i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=4;l>0;l--)
		{
			for(int z=0;z<2*l-2;z++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=l;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
