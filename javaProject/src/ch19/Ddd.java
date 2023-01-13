package ch19;

public class Ddd {
public static void main(String[] args) {
	double [] d = new double[5];
	double y = 10.5;
	
	for(int i=0; i<d.length; i++) {
		d[i] = i/y;
		System.out.println("d["+i+"] ="+d[i]);
	}
	}

}
	
