package work.ch01;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수값:");
		int n = stdIn.nextInt();
		
		// if (조건식) 실행문 else 실행문
		
		if(n>=0)
			// n >= 0이 true일 때 실행ㅎㄴ다.
			System.out.println("절대값은 " + n +"입니다.");
		else
			// n >= 0이 false일 때 실행ㅎㄴ다.
			System.out.println("절대값은 " + -n +"입니다.");
		

	}

}
