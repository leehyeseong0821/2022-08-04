package projectA14;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		Car[] car1= new Car[5];
		
		int i=0;
		do { 
			car1[i]=new Car();
			System.out.println("이름:");
			String name=in.nextLine();
			System.out.println("년식:");
			String age=in.nextLine();
			System.out.println("속도:");
			String Speed=in.nextLine();
			car1[i].setName(name);
			car1[i].setAge(age);
			car1[i].setSpeed(Speed);
			
			i++;
			
			
		
		}while(i<car1.length);
		 i=0;
		 do {car1[i].info();
		 i++;
			 
		 }while(i<car1.length);
		 

	}

}
