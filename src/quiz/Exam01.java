package quiz;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수 입력 >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		t.bigger(a, b);
		System.out.println(t.big(a, b));
	}
}