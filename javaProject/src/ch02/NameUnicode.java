package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char aValue = '\uae40';
		char bValue = '\uc724';
		char cValue = '\uaddc';
		
		System.out.println("char형 (\'\\uae40\'): " + aValue);
		System.out.println("char형 (\'\\uc724\'): " + bValue);
		System.out.println("char형 (\'\\uaddc\'): " + cValue);
	}
}
// &#xAE40; 김 16진수
// &#xC724;&#x000D;&#x000A; 윤 
// &#xADDC;&#x000D;&#x000A; 규

