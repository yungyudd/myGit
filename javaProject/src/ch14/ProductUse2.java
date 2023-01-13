package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ex = "";
		List<Product> list = new ArrayList<>();
		
		System.out.println("제품정보를 입력하세요");
		while(true) {
			Product p1 = new Product();
			p1.input();
			list.add(p1);
			System.out.println("종료를 원하시면 0또는 exit를 입력하세요");
			ex = sc.next();
			if(ex.equals("exit")||ex.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("============================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세");
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Product p = list.get(i);
			System.out.println(p.getNum()+"\t"+p.getName()+"\t"+p.getManu()+"\t"+p.getPrice()+"\t"+p.getAmount()+
					"\t"+p.getMoney()+"\t"+String.format("%.1f", p.getTax()));
		}
		System.out.println("============================================================");
		
	}

}
