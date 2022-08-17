package projectA11;

public class Book {
	
	String title;
	String author;

	
	public Book(String t) {
		this(t,"작자미상");
	}
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
//		멤버 메소드 호출
		this.pirntTitle();
	}
	
	public void pirntTitle() {
		System.out.println(this.title);
	}
	
	

	public static void main(String[] args) {
		 
		Book L=new Book("어린왕자","춘향전");
		Book S=new Book("춘향전");
		
		
		System.out.println(L.title+"책의 저자는 "+L.author);
		System.out.println(S.title+"책의 저자는 "+S.author);
		
		
	}

}
