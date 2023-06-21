package quiz;

public class Test02 {
	public void test(int num) {
		if(num%2==0) {
			if(num==0)
				System.out.println("0 입니다.");
			else
				System.out.println("짝수입니다.");
		} else if(num%2!=0) {			
			if(num<0)
				System.out.println("음수 입니다.");
			else
				System.out.println("홀수입니다.");
		} else
			System.out.println("잘못 입력하셨습니다.");
	}
}