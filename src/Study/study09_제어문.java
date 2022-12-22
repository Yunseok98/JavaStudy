package Study;

public class study09_제어문 {
	public static void main(String[] args) {
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("case1"); // 점프 위치 변수가 2이므로 실행 안됨.
		case 2:
			System.out.println("case2"); // 점프 위치 변수가 2이므로 실행됨
		case 3:
			System.out.println("case3"); // 실행
		default:
			System.out.println("case4"); // 싫행
		}

		int b = 3;
		switch (b) {
		case 1:
			System.out.println("case a"); // 점프 위치 변수가 3이므로 실행 안됨.
			break;
		case 2:
			System.out.println("case b"); // 점프 위치 변수가 3이므로 실행 안됨.
			break;
		case 3:
			System.out.println("case c"); // 점프 위치 변수가 3이므로 실행 안됨.
			break;
		default:
			System.out.println("case d"); // case 3 실행 후 break 키워드 실행 되어 탈출
		}
	}
}
