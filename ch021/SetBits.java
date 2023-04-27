package ch021;

import java.util.Scanner;

public class SetBits {

	//---int 형 비트 구성---///
	static void printBits(int x) {
		for(int i = 31; i>=0; i--)
			System.out.println(((x >>> i & 1) == 1)? '1' : '0');
	}
	
	//--- x의 pos위치에 있는 비트부터 n개 비트를 1로 변경한 값을 반환 ---//
	static int set(int x, int pos, int n) {
		return x | (~(~0 << n)<<pos);
	}
	//--- x의 pos위치에 있는 비트부터 n개 비트를 0로 변경한 값을 반환 ---//
	static int reset(int x, int pos, int n) {
		return x & (~(~0 << n)<<pos);
	}
	//--- x의 pos위치에 있는 비트부터 n개의 비트를 반전시킨 값을 반환 ---//
		static int inverse(int x, int pos, int n) {
			return x ^ (~(~0 << n)<<pos);
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수x의 pos번째 비트를 변경합니다.");
		System.out.print("x   : "); int x = stdIn.nextInt();
		System.out.print("pos : "); int pos = stdIn.nextInt();
		System.out.print("n   : "); int n = stdIn.nextInt();
		
		System.out.println("x                    ="); printBits(x);
		System.out.println("\nset(x,pos,n)         ="); printBits(set(x, pos,n));
		System.out.println("\nreset(x,pos,n)       ="); printBits(reset(x, pos,n));
		System.out.println("\ninverse(x,pos,n)       ="); printBits(inverse(x, pos,n));
		System.out.println();

	}

}
