package gweek;

import java.util.Scanner;

public class LenOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter charecter : ");
		String string=sc.nextLine();
		char ch[]=string.toCharArray();
		System.out.println("The length of given  "+ch.length);
		sc.close();
			}
}