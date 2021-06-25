package Bonus;
import java.util.Scanner;

public class Bonus3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dan : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=dan; i++)
		{
			for(int j=0; j<dan-i; j++)
			{
				System.out.print(' ');
			}
			for (int k=0; k<i*2-1; k++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=0; i<dan-1; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print(' ');
			}
			for (int k=i; k<dan*2-3-i; k++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}
}
