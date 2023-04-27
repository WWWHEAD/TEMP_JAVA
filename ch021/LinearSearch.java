package ch021;

import java.util.Scanner;

public class LinearSearch {

	//배열 a의 요소로부터 key와 일치하는 가장 앞에 있는 요소를 선형 탐색---//
	static int linerSearch(int[] a, int key) {
		for(int i=0; i<a.length; i++)
			if(a[i] == key)
				return i;   // 탐색성공
		return -1;			//탐색실패(-1반환)
	}
	//배열 a의 요소로부터 key와 일치하는 가장 뒤 있는 요소를 선형 탐색---//
	static int LinearSearchR(int[] a, int key) {
		for(int i = a.length -1; i>=0; i--)
			if(a[i]==key)
				return i;	//탐색성공(인덱스반환)
		return -1;		//탐색실패(-1반환)
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];			//요소 수 num의 배열
		for(int i=0; i< num; i++) {
			System.out.println("x["+ i+ "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾는 값: ");	//키 값 얻기
		int ky = stdIn.nextInt();
		
		int idxTop = linerSearch(x, ky); //배열x에서 ky를 탐색
		int idxBtm = LinearSearchR(x, ky); //배열x에서 ky를 탐색
		
		if (idxTop == -1)
			System.out.println("해당 값은 존재하지 않습니다.");
		else if(idxTop == idxBtm)
			System.out.println("해당 값은  x["+ idxTop+"]에 있습니다.");
		else {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x[}+"+ idxTop +"]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 x[}+"+ idxBtm +"]에 있습니다.");
		}
		
		

	}

}
