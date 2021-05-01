package loops;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i-1;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int j=n;j>i;j--)
//			{
//				System.out.print(" *  ");
//			}
//			System.out.println();
//		}
    int num=1;
		for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print("  ");
				}
				for(int j=n;j>i;j--)
				{
					System.out.print(" "+num++ +"  ");
				}
				System.out.println();
			}

	}
	System.out.println("done with git");

	System.out.println("new chage in tab branch");



}
