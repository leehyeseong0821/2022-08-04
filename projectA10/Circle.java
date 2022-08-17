package projectA10;

public class Circle {
	
// 멤버변수 
	int radius;
	String name;
//	생성자 디폴터 생성자
	public Circle(){
		this.radius=1;
		this.name="";
	}
//	생성자 파라메타 2개인 생성자
    public Circle(int r,String n) {
    	this.radius=r;
    	this.name=n;
    	
    }
//    멤버 메소드
    public double getArea() {
    	return 3.14*radius*radius;
    }
public static void main(String[] args) {
//		인스턴스화 
	Circle pizza= new Circle(10,"페페로니");
//	메소드 호출
	
	double area = pizza.getArea();
	
	System.out.println(pizza.name+"의 면적은 "+area);
	
	Circle donut = new Circle(2,"던킨");
	double area1= donut.getArea();
	System.out.println((donut.name+"의 면적은 "+area1));
	
//	인스턴스 화 
	Circle donut1 = new Circle();
	
	donut1.name="도너츠";
	donut1.radius=8;
	area=donut.getArea();
	System.out.println(donut1.name+"의 면적은"+area);
	
	
	
	
	
	
	}
}
