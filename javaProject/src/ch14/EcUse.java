package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EcUse {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<Ec> list = new ArrayList<>();
		
		list.add(new Ec(1234,"2023-01-04","하이트맥주","삼성","3791883268", 55900));
		list.add(new Ec(1234,"2022-12-12","꼬깔콘","롯데","3569137845", 232600));
		list.add(new Ec(1234,"2023-01-01","노트북","현대","3610234482", 2600000));


		map.put("list", list);
		print(map);
	}

	static void print(Map<String, Object> map) {
		ArrayList<Ec> list2 = (ArrayList<Ec>)map.get("list");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-------------------------------------------------------------------");
		for(Ec e: list2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()+"\t"+
		e.getCardName()+"\t"+e.getCardNo()+"\t"+e.getPay());
		}
		System.out.println("-------------------------------------------------------------------");
	}
	

	
}
