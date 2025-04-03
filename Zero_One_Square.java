package number_patterns;

import java.util.Scanner;

/*
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
*/
public class Zero_One_Square 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)%2==0)
					System.out.print(1 +" ");
				else
					System.out.print(0 +" ");
			}
			System.out.println();
		}
	}
}
