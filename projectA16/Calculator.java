package projectA16;

public class Calculator {
  
//	 인스턴스 멤버변수/인스턴스 마다 각각 하나씩 만들어짐
	
	int intValue=0;
//	클래스 멤버 변수 //인스턴스 마다 가각 따로 만들어지지않고 한번에 만들수있음
	
	static double PI=3.14;
	static int sintValue=0;
	
	
	public static int pluse(int x,int y) {
		return x+y;
	}
	public static int minus(int x,int y) {
		return x-y;
	}
	
}
