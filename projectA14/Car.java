package projectA14;

public class Car {
	
	private String name;
	private String age;
	private String Speed;
	
	public Car() {};
	
	
	public Car(String name) {
		this.name=name;
	}
	public Car(String name,String age,String Speed) {
		this(name);
		this.age=age;
		this.Speed=Speed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSpeed() {
		return Speed;
	}


	public void setSpeed(String speed) {
		Speed = speed;
	}
	public void info() {
		
		System.out.println("++++++");
		System.out.println("이름:"+this.name);
		System.out.println("나이:"+this.age);
		System.out.println("속도:"+this.Speed);
		System.out.println("++++++");
	}

}
