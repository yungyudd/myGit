package ch08;

public class BookUse {

	public static void main(String[] args) {
		Book b = new Book("java","김","영진",2017, 20000, 10000);
		b.print();
		
		Book b2 = new Book();
		b2.print();

	}

}
