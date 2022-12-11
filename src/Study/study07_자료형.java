package Study;

public class study07_자료형 {
	public static void main(String[] args) {
		// #1. boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		// #2. 정수(byte, short, int, long) : 음의 정수 / 0 / 양의 정수
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

		// #3. 실수(float, double) : 음의 실수 / 0 / 양의 실수
		float value5 = 1.2F; // F를 붙혀야 f로 저장 가능
		double value6 = -1.5;
		double value7 = 5; // 정수를 실수로 바꿔서 5.0으로 나옴
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		// #4. 문자(char) : 문자, 정수
		// #4-1. 문자로 저장하는 방법
		char value8 = 'A';
		char value9 = '가';
		char value10 = '3'; // 숫자가 아니라 문자임 '' 안에 들어있어서
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
				
		// #4-2. 정수로 저장하는 방법
		char value11 = 65; // 10 진수
		char value12 = 0xac00; // 16진수
		char value13 = 51; // 10진수
		System.out.println(value11); // A
		System.out.println(value12); // 가
		System.out.println(value13); // 3
				
		// #4-3. 유니코드로 저장하는 방법
		char value14 = '\u0041'; // 유니코드
		char value15 = '\uac00'; // 유니코드
		char value16 = '\u0033'; // 3
		System.out.println(value14); // A
		System.out.println(value15); // 가
		System.out.println(value16); // 3
	}
}
