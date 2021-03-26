package part01.sec01.exam02;

public class StringExample3_03 {

	public static void main(String[] args) {
//		String str1 = "자바";
//		String str2 = "자바";

		String str1 = new String("자바");
		String str2 = new String("자바");

		if (str1 .equals(str2))	// 변수의 값을 비교 (( <> ==연산자는 참조하는주소를 비교))
			System.out.println("같음");
		else
			System.out.println("다르다");

	}

}
