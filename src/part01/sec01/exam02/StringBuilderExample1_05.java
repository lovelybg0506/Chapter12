package part01.sec01.exam02;

public class StringBuilderExample1_05 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가 ");
		System.out.println(sb);
		System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니")); // 합쳐짐 그리고 누적
		System.out.println(sb.insert(26,"하나 ")); // 26번째에 추가됨 and 누적
		System.out.println(sb.delete(21,23)); // 21 , 22전 수인 23 없어짐 and 누적 ( endnumber-1)
		System.out.println(sb.deleteCharAt(9)); // 9 다음 10번째 char가 사라짐.
		System.out.println(sb); // 다 누적됨
		// 0부터 카운팅 !!
		System.out.println(sb.toString()); // 객체가 가지고있는 문자열을 가지고온다.
		
	
	
	}
}
