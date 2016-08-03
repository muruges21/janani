import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String ");
			StringBuffer str =new StringBuffer(sc.nextLine());
			System.out.println("After reversing "+str.reverse());
	}

}
