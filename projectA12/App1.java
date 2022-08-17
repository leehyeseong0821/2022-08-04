package projectA12;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		Student[] std = new Student[5];
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<std.length;i++){
//		인스턴스화 	
		  std[i]= new Student();
		  System.out.println("이름");
//		  한줄을 입력받는다.
		  String name = in.nextLine();
//		  입력받은 값을 멤버 메소드를 사용하여설정
		  std[i].setName(name);
		  System.out.println("국어점수");
		  String kor=in.nextLine();
		  std[i].setKor(Integer.parseInt(kor));
		  System.out.println("영어점수");
		  String eng=in.nextLine();
		  std[i].setKor(Integer.parseInt(eng));
		  System.out.println("수학점수");
		  String math=in.nextLine();
		  std[i].setMath(Integer.parseInt(math));
		}
		 
		for(int i=0;i<std.length;i++) {
			System.out.println("이름"+std[i].getName());
			System.out.println("국어점수"+std[i].getKor());
			System.out.println("영어점수"+std[i].getEng());
			System.out.println("수학점수"+std[i].getMath());
		
			
			
		}
	}

}
