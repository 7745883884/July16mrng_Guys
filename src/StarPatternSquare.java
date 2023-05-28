import java.util.*;

public class StarPatternSquare {

	public static void main(String[] args) {
		Scanner lc = new Scanner(System.in);
		System.out.println("enter the value of a =");

		int row = lc.nextInt();
		System.out.println("enter the value of b =");
		int col;
		col = lc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || j == 1 || i == row || j == col) {

					System.out.print(" *");
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

}
