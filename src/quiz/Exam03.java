package quiz;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test03 t = new Test03();
		int num;
		
		System.out.print("정수 >> ");
		num = sc.nextInt();
		
		t.test(num);
	}
}