package Study;

public class study08_제어문 {
	public static void main(String[] args) {
	if(1<2) {
		System.out.println("if문 실행"); // 조건식이 true여서 실행
	}
	
	if(1>2) {
		System.out.println("조건식 true 실행"); // 조건식이 fasle여서 실행 안함
	}else {
		System.out.println("조건식 fasle 실행"); // 조건식이 fasle여서 실행
	}
	
	int a = 85;
	if(a >= 90 ) {
		System.out.println("A학점"); // 조건식이 false여서 실행 안함
	}else if(a >= 80) {
		System.out.println("B학점"); // 조건식이 true여서 if문 탈출
	}else if(a >= 70) {
		System.out.println("C학점"); // 위에서 if문 탈출해서 실행 안됨
	}else {
		System.out.println("F학점");
	}
	}
}
