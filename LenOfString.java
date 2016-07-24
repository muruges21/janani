package gweek;

import java.util.Scanner;

public class LenOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter String : ");
		String string=sc.nextLine();
		System.out.println("The length of given  "+string.length());
		sc.close();
			}
}