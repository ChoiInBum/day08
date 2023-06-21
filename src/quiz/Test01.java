package quiz;

public class Test01 {
	
	public void bigger(int m, int n) {
		if(m>n) 
			System.out.println(m+"이(가) "+n+"보다 더 크다.");
		else if(m<n)
			System.out.println(n+"이(가) "+m+"보다 더 크다.");
	}
	
	public int big(int m, int n) {
		if(m>=n)
			return m;
		else if(m<=n)
			return n;
		
		return 0;
	}
	
}