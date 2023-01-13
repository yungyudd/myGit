package ch10;

//개별적인 값을 사용할 때 => nonstatic 
//공통적인 값을 사용할 때 => static  
public class StaticExam {

	public static void main(String[] args) {
		//대표적으로 자주 사용하고 고정된 값은 static을 사용한다. ex Math
		int a= 40, b=30, result;
		result = Math.max(a, b); //둘 중 큰 값
		System.out.println(result);
		result = Math.min(a, b);
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r =15.3;
		System.out.println("원의 둘레 : " +2*Math.PI*r);
		System.out.println("원의 넓이 : " +Math.PI*r*r);

	}

}
