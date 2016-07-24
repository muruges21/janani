package gweek;

import java.util.Scanner;

public class RevOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number  : ");
		int num=sc.nextInt();
		int rev=0,rem;
		for(;num>=1;num/=10)
		{
			rem=num % 10;
			rev=(rev*10)+rem;
		}
		
		System.out.println("reverse of given number is "+rev);
		sc.close();
			}
}