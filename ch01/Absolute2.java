package work.ch01;

import java.util.Scanner;

public class Absolute2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수값:");
		int n = stdIn.nextInt();
		int abs;
		
		// if (조건식) 실행문 else 실행문
		
		if(n>=0)
			// n >= 0이 true일 때 실행합니다.
			abs = n;
		else
			abs = -n;
			// n >= 0이 false일 때 실행합니다.
			System.out.println("절대값은 " + abs
					+"입니다.");
		

	}

}
