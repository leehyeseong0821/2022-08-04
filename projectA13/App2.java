package projectA13;

import java.util.Scanner;

public class App2 {

	

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 Person person1 = new Person("이혜성");
		 person1.info();
		 
		 Person person2 = new Person("이혜성",32,"백수");
		 person2.info();
		 
		 Person[]person3=new Person[10];
		  int i=0;
		 while(i<person3.length) {
			 
			 person3[i]=new Person();
			 System.out.println("이름");
			 person3[i].setName(in.nextLine());
			 System.out.println("나이");
			 person3[i].setAge(Integer.parseInt(in.nextLine()));
			 System.out.println("직업");
			 person3[i].setJob(in.nextLine());
			 i++;
			 
		 }
       i=0;
       while(i<person3.length) {
    	   person3[i].info();
    	   i++;
    	   
       }
	}

}
