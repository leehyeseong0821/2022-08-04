package projectA15;

public class projectA1003 {
//	클래스 멤버 메소드
	
	static void suma(int[]suma) {
		
		int sum=0;
		for(int i:suma) {
			sum= sum+i;
		}
		System.out.println("합은:"+sum);
		
	}
//	클래스 멤버 메소드
	static void sumb(int...sumb) {
		int sum=0;
		for(int i:sumb) {
			sum= sum+i;
		}
		System.out.println("합은:"+sum);
		
	}

	public static void main(String[] args) {
	 suma(new int[] {1,2,3,4,5,6,7,8,9,10});
	 sumb(1,2,3,4,5,6,7,8,9,10);

	}

}
