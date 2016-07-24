package gweek;
import java.util.Scanner;
public class VowelConst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charecter to check whether vowel or constant : ");
		char c = sc.next().trim().charAt(0);
			if((c>='a' && c<='z')|| (c>='A' && c>='B'))
				System.out.println("The given is alphapetic.. ");
			else
				System.out.println("The given is not alphapetic.. ");
		sc.close();
			}
	}
