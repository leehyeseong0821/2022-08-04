package projectA10;

public class projectA1001 {

	public static void main(String[] args) {
		Circle bendeddk = new Circle(10,"빈대떡");
		
//		멤버 메소드 호출으 크기를 구한다.
		double area =bendeddk.getArea();
		System.out.println(bendeddk.name+"의 면적은 "+area);
           
		
		Circle pizza= new Circle(20,"새우피자");
		double area1 =pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area1);
	}

}
