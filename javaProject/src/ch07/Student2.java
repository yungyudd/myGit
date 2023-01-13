package ch07;

public class Student2 { //getter,setter 활용 안하는 방법
	private String name;
	private String major;
	private int year;
	private int num;
	private double point;
	private int money;
	private int save;
	
	public void input(String name, String major, int year, int i, double point, int money) {
		this.name =name;
		this.major = name;
		this.year = year;
		this.num = i;
		this.point = point;
		this.money = money;
	
		if(point >=4.3) {
			save = money;
		}else if(point >=4.0) {
			save = 250;
		}else if(point >=3.5) {
			save = 100;
		}
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+money+"\t"+save);
	}

}
