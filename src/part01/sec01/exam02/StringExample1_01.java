package part01.sec01.exam02;

public class StringExample1_01 {

	public static void main(String[] args) {
		String str = "Java Coffee";
		int len = str.length();

		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); // charAt() => (int index) Returns the char value at the specified index.
			System.out.println(ch);		//    Java Coffee > J = 0 , a = 1 , v = 2 , a = 3 ...
		}

	}

}
