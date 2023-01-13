package ch05;

public class Array3Dim {
//3차원 배열: 배열명 = new 자료형[면][행][열]
	public static void main(String[] args) {
		//2면 3행 4열
		String[][][] subject = {{{"js1","js2","js3","js4"},{"자바","파이썬","알고리즘","자료구조"},{"정","윤","심","최"}},
				{{"al01","a02","al03","al04"},{"윤리","수학","영어","국어"},{"홍","백","김","이"}}};
		
		for(int i=0; i<subject.length; i++) {//면
			for(int j=0; j<subject[i].length; j++) { //행
				for(int x=0; x<subject[i][j].length; x++) {//열
					System.out.println("["+i+"]{"+j+"]["+x+"] : "+subject[i][j][x]);
				}
			}
			System.out.println("========================================");
		}//end outer for

	}

}
