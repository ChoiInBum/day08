package quiz;

public class Test03 {
	public void test(int num) {
		System.out.println("1에서 "+num+"까지의 3의 배수");
		for(int i=1; i<=num; i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}			
	}
}