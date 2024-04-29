import java.util.Scanner;

public class Ulam{

	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie n ein");

		do {
		n = scanner.nextInt();
		}while(n > 1000000);

		System.out.println("Die Zahl n ist nun bei ");
	    Ulamfunc(n);
	    System.out.println("angekommen");
	}

	public static void Ulamfunc(int n) {
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		System.out.println(n);
	}
}

