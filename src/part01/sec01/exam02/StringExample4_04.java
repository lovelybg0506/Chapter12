package part01.sec01.exam02;

public class StringExample4_04 {

	public static void main(String[] args) {
		String str = "자바를 열심히 하자";
		String str1 = " Let it be. ";
		String str2 = str1.trim();	// 좌우 공백을 제거해서 str2에 넣어라.
		
		
		System.out.println(str.substring(3));	// 3번째문자부터 쭉
		System.out.println(str.substring(3,9)); // 3부터 8번째 문자까지 endIndex-1
		
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom."));
		System.out.println(str2.toUpperCase());	// 대문자로
		System.out.println(str2.toLowerCase());	// 소문자로
		System.out.println(str2.replace('e', 'a'));	// e를 a로 바꿔라.
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
