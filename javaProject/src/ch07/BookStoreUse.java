package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore b = new BookStore();
		b.setBookName("어린왕자");
		b.setAuthor("생떽지베리");
		b.setPress("영진");
		b.setYear(1999);
		b.setPrice(17000);
		b.setAmount(30000);
		
		b.print();
		System.out.println(b);

	}

}
