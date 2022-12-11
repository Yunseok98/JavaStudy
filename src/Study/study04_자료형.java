package Study;

public class study04_자료형 {
	public static void main(String[] args) {
		// #1. 변수의 선언과 값의 대입을 동시에 하는 방법
		int a = 3;
		
		// #2. 변수의 선언 + 값의 대입
		int b;
		b = 3;
		
		// #3. 변수의 이름
		boolean aBcD; // 가능은 하지만 권고사항 위배
		byte 가나다;
		short _abcd; // 특수 문자 중 _ , $ 만 사용 가능
		char $ab_cd; // 특수 문자 중 _ , $ 만 사용 가능
		int 3abcd; // 숫자는 제일 앞에 올 수 없다
		long abcd3; // 숫자 사용 가능
		float int; // 자바에서 사용하는 키워드는 불가능
		double main; // 가능, 메소드 이름과 변수이름은 동일해도 무관
		int ABC; // 가능은 하지만 권고사항 위배
		
		// #4. 상수의 이름
		final double PI; // 한 개 단어를 사용 시 대문자 사용
		final int MY_DATA; // 두 개 이상의 단어를 결합 시 언더바(_) 사용
		final float myData // 가능은 하지만 권고사항 위배
		
		abc(); // 메소드 호출 방법
		System.out.println(abc); // 변수를 사용하는 방법
	}
}
