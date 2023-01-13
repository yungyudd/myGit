package homework;

public class Manager extends Employee{
	private double bonus;
	
	public void input(int num, String name, String address, String email, String rrn, int salary) {
		setNum(num);
		setName(name);
		setAddress(address);
		setEmail(email);
		setSalary(salary);
		setRrn(rrn);
		
		
	}
	public void Calc() {
		bonus = (salary * 0.3);
	}
	public void Print() {
		System.out.println("=================================================");
		System.out.println("사번: "+getNum()+"\n이름: "+getName()+"\n주소: "+getAddress()+"\n이메일: "+getEmail()+
				"\n주민번호: "+getRrn()+"\n연봉: "+getSalary()+"\n보너스: "+bonus);
		System.out.println("=================================================");
	}

	
}
