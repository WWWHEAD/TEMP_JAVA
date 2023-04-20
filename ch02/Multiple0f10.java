package work.ch02;

import java.util.Scanner;

public class Multiple0f10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 갑");
		
		int n = stdIn.nextInt();
		
		if(n>0)
			if(n%10 == 0)
				System.out.println("이 값은 10의 배수입니다.");
			else
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else
			System.out.println("음의 정수값을 입력했습니다.");
		

	}

}
