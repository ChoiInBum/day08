package method;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		int n = t.inputData();
		//System.out.println("결과 : "+n);
		int s = t.opData(n);
		//System.out.println(s);
		t.printData(n, s);
	}
}