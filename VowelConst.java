package gweek;
import java.util.Scanner;
public class VowelConst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charecter to check whether vowel or constant : ");
		char ch = sc.next().toUpperCase().trim().charAt(0);
		switch(ch)
		{
		case 'A' :
				System.out.println("The given charecter is vowel 'A");
				break;
		case 'E' :
			System.out.println("The given charecter is vowel 'E");
			break;
		case 'I' :
			System.out.println("The given charecter is vowel 'I'");
			break;
		case 'O' :
			System.out.println("The given charecter is vowel 'O'");
			break;
		case 'U' :
			System.out.println("The given charecter is vowel 'U'");
			break;
		default :
			System.out.println("The given charecter is constant..");
		}
		sc.close();
			}
	}
