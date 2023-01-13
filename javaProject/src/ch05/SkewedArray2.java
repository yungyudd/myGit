package ch05;
//비정방형배열(가변형, 레그드배열)
public class SkewedArray2 {

	public static void main(String[] args) {
		int intArray[][]= new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 +j; //데이터 입력
			}
		}
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" "); //데이터 출력
			}
			System.out.println();
		}
	}

}
