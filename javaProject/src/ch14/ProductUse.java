package ch14;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> li = new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요.");
		Product p1 = new Product();
		p1.input();
		Product p2 = new Product();
		p2.input();
		
		li.add(p1);
		li.add(p2);
		
		System.out.println("===================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<li.size(); i++) {
			Product p = li.get(i);
			System.out.println(p.getNum()+"\t"+p.getName()+"\t"+p.getManu()+"\t"+p.getPrice()+"\t"+p.getAmount()+"\t"+p.getMoney());
		}
		System.out.println("===================================================");
	}

}
