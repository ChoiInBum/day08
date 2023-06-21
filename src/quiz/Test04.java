package quiz;

public class Test04 {
	public void test(int num) {
		boolean isPrime = true;

		for(int i = 2; i <= num/2; i++) {        	
			if(num%i == 0) {            	
				isPrime = false; 
				break;
			}
		}
        
		System.out.printf(isPrime ? "소수입니다." : "소수가 아닙니다.");
	}
}
