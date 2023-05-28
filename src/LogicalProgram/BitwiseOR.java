package LogicalProgram;

public class BitwiseOR {
	public static void main(String[] args) {
        String str1 = "10010001";
        String str2 = "11000011";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            result.append((str1.charAt(i) == '1' || str2.charAt(i) == '1') ? '1' : '0');
        }

        System.out.println(result);
    }
}
