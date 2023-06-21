package method;

import java.util.Scanner;

//TestClass : 입력, 출력, 연산하는 기능
//MainClass : 기본 호출 및 연동

public class TestClass07 {
	public int inputData() {
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.println("수 입력");
		num = input.nextInt();
		
		return num;
	}
	
	public void printData(int num, int sum) {
		System.out.print("1~"+num+"까지 합 : "+sum);
	}
	
	public int opData(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}
}