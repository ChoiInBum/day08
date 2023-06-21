package method;

public class TestClass03 {
	public String name;
	public String addr;
	public int age;
	
	public void m1() {
		name = "홍길동";
		System.out.println("제 이름은 "+"\'"+name+"\'"+"입니다.");
	}
	
	public void m2() {
		addr = "서울";
		System.out.println("주소는 "+"\'"+addr+"\'"+"입니다.");
	}
	
	public void m3() {
		age = 20;
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
}
