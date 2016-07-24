package gweek;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number  : ");
		int num=sc.nextInt();
		int number=num;
		int rev=0,rem;
		for(;num>=1;num/=10)
		{
			rem=num % 10;
			rev=(rev*10)+rem;
		}
		if(rev==number)
		System.out.println(number+" is palindrome : ");
		else
			System.out.println(number+" is not palindrome : ");
		sc.close();
			}
}