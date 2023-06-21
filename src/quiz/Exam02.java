package quiz;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test02 t = new Test02();
		int num;
		
		System.out.print("정수 >> ");
		num = sc.nextInt();
		
		t.test(num);
	}
}