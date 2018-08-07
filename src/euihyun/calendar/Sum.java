package euihyun.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		int a, b;
		int c;
		String s1, s2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 수를 입력해주세요 :");
		s1 = scanner.next();
		s2 = scanner.next();

		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		c = a + b;

		System.out.println("두 수의 합 :" + c);
		scanner.close();
	}
}
