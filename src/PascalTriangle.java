import java.util.Scanner;

/**
 * PascalTriangle.java
 * @author Kamal Thapa(KT)
 * @version 1.0
 * @since Nov 3, 2017
 * 
 */

public class PascalTriangle {

	public static void main(String[] args) 
	{
		int r, i, j, k, number=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Rows for Pascal Triangle");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r;k>i;k--)
			{
				System.out.print(" ");
			}
			number=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number *(i - j) / (j +1);
			}
			System.out.println();
		}

	}

}

