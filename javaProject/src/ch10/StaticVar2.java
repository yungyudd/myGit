package ch10;

public class StaticVar2 {
	static int total;
	String model;
	public StaticVar2(String model) { //생성자
		this.model=model;
		total++;
	}
}
