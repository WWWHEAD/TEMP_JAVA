package ch05;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("세 자리의 정숫값:");
			x = stdIn.nextInt();
			
		}while (x < 100 || x > 999);
		System.out.println("입력한 값은 " + x + "입니다.");
	}

}
