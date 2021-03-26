package part01.sec01.exam02;

import java.util.StringTokenizer;

public class StringBuilderExample1_06 {
	
	public static void main(String[] args) {
		
		StringTokenizer stok = new StringTokenizer("사과,배,복숭아",",");
		while(stok.hasMoreElements()) {	// 사과 배 복숭아 요소들이 있는가 있으면 있는동안 반복해서 처리해라
			String str=stok.nextToken();// nextToken(); 공백으로 분리, 콤마를 찍어도된다
			System.out.println(str);
		}
	
	}
}
