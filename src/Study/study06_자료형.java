package Study;

public class study06_자료형 {
	public static void main(String[] args) {
		// # 1. Float의 정밀도(대략 소숫점 7자리 정도만 표현)
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		// #2 double의 정밀도(대략 소숫점 15자리 정도만 표현)
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}

}
