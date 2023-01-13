package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); //해쉬맵 객체 생성
		List<ProdEx> list = new ArrayList<>(); //리스트 객체 생성
		
		list.add(new ProdEx("TV", "oled123", "LG", 1000, 50));
		list.add(new ProdEx("냉장고", "sm123", "sam", 300, 520));
		list.add(new ProdEx("에어컨", "win123", "wnia", 100, 250));
		list.add(new ProdEx("com", "asus23", "asus", 100, 500));
		
		map.put("list", list); //맵에 리스트 추가 put("key", value)
		print(map);
	}
	
	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list"); //좌변:ArrayList, 우변:Object
		System.out.println("------------------------------------------------(단위:만원)");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("---------------------------------------------------------");
		for(ProdEx s: list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("---------------------------------------------------------");
	}

}
