package Patterns;

import java.util.Scanner;

public class Star7 
{

	public static void print(int r)
	{
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	 public static void main(String[] args)
	 {
		 
		 Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter row");
				int r=sc.nextInt();
				print(r);		
			}
		}
	 

}
