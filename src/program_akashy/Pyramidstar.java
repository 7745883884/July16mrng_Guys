package program_akashy;

public class Pyramidstar {

	public static void main(String[] args) {
		int space = 5, star = 1, line = 5;
		for (int i = 1; i <= line; i++) {
		for (int j = 1; j <= space; j++) {
		System.out.print(" ");
		}
		for (int j = 1; j <= star; j++) {
		System.out.print("* ");
		}
		space--;
		star++;
		System.out.println();
  
}
}
	}