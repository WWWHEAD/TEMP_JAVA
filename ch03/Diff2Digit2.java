import java.util.Scanner;

public class Diff2Digit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a:");
		int a = stdIn.nextInt();
		
		System.out.println("정수 b:");
		int b = stdIn.nextInt();
		
		int diff = a >= b ? a-b : b-a;
		System.out.println("두 값의 차는 " + (diff <= 10 ? "10이하": "11이상")+ "입니다.");
 	}

}
