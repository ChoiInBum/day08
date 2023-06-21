package quiz;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test05 t = new Test05();
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		System.out.println(n+"의 절대값 : "+t.test(n));
	}
}