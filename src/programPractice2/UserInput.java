package programPractice2;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	System.out.println("-----Fill your all details----- ");
	
	Scanner n = new Scanner(System.in);
	String name =n.nextLine();
	
	System.out.println("Your name is =" + name);
	
	int age =n.nextInt();
	System.out.println("Your age is =" + age);
	long mobno  =n.nextLong();
	System.out.println("Your mob no is =" + mobno);
   System.out.println("****Thank you for Information****");
//	lucky choudhari
//	Your name is =lucky choudhari
//	24
//	Your age is =24
//	7745883884
//	Your mob no is =7745883884


}
}
