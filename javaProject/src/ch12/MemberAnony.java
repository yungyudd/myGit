package ch12;

public class MemberAnony {
	
	public static void main(String[] args) {
		Member m = new Member() {
	
			@Override
			public void Num(int num) {
				
				System.out.println("고객번호: "+num);
			}

			@Override
			public void Name(String name) {
				System.out.println("이름: "+name);
			}

			@Override
			public void Email(String email) {
				System.out.println("이메일: "+email);
			}
			
		};
		System.out.println("========================");
		m.Num(2);
		m.Name("김길동");
		m.Email("kim@gmail.com");
		System.out.println("========================");
	}
}
