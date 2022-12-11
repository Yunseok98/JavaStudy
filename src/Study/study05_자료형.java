package Study;

public class study05_자료형 {
	public static void main(String[] args) {
		
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}
		// System.out.println(value2); // 자신이 생성된 중괄호를 벗어나면 삭제됨
		System.out.println(value1);
	}

}
