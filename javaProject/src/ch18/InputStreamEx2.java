package ch18;

import java.io.IOException;

public class InputStreamEx2 {
	public static void main(String[] args) {
		int var=0;
		System.out.print("내용을 입력하세요: ");
		try {
			while(var != 13) {
				System.out.println(var+"==> "+(char)var);
				var = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
