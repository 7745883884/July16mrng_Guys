import java.util.Scanner;

public class shifting {

	// import java.util.Scanner

	public static void main(String[] args) {
		char ar[] = { 'a', 'b', 'c' };
		char ar1[] = { 'A', 'B', 'C' };

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any index");
		int no = s.nextInt();

		ar[no] = ar1[no];
		System.out.println(ar);

	}
}
