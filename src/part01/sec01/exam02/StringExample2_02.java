package part01.sec01.exam02;

public class StringExample2_02 {

	public static void main(String[] args) {
//		String str1 = "자바";
//		String str2 = "자바";

		String str1 = new String("자바");
		String str2 = new String("자바");
		
		if(str1==str2)
			System.out.println("참조하는 값이 같다");
		else
			System.out.println("다르다");
		
	}

}
