package ch012;

import java.util.Scanner;

public class Average3Wrong {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 x,y,z의 평균을 구합니다.");
		System.out.println("x값");int x = stdIn.nextInt();
		System.out.println("y값");int y = stdIn.nextInt();
		System.out.println("z값");int z = stdIn.nextInt();
		
		double ave = (x + y + z) /3 ;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n,", ave);
	}

}
