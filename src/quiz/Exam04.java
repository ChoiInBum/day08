package quiz;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test04 t = new Test04();
		int n;		
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		t.test(n);
	}
}