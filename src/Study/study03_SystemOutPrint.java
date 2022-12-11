package Study;

public class study03_SystemOutPrint {
	public static void main(String[] args) {
		// System.out.println()
		System.out.println("안녕");
		System.out.println("안녕" + "하세요");
		System.out.println("안녕" + 1);
		System.out.println("안녕" + 1 + 2);
		System.out.println(1 + 2 + "안녕");
		System.out.println(10.1);
		System.out.println();

		int a = 3;
		String b = "화면";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		System.out.println();

		// System.out.print()
		System.out.print("화면");
		System.out.print("출력");
		System.out.print(3);
		System.out.print("\n");
		System.out.print("\n");

		// System.out.printf()
		System.out.printf("%d\n", 30);
		System.out.printf("%o\n", 30);
		System.out.printf("%x\n", 30);
		System.out.printf("%s\n", "출력");
		System.out.printf("%f\n", 5.8);
		System.out.printf("%4.3f\n", 5.8);
		System.out.printf("%d와 %4.2f\n", 4, 5.8);
	}

}
