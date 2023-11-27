package JavaPractice01.study.study;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Code1127_3 {

	public static void main(String[] args) {
		System.out.println("사용하는 기본 문자셋:" + Charset.defaultCharset());
		byte[] bt = {65,66,68};
		String btTemp = new String(bt);
		System.out.println(btTemp);
		
		char[] btt = {'u','l','s'};
		String bttTemp = new String(btt);
		System.out.println(bttTemp);
		try {		
			byte[] bt1 = "a가나다라".getBytes();
			byte[] bt2 = "a가나다라".getBytes("UTF-16");

			for(byte temp: bt1)
				System.out.print(temp +" ");
			System.out.println();
			for(int i=0; i < bt2.length;i++)
				System.out.print(i +":"+bt2[i]);
			System.out.println();
			
			String str1 = new String(bt1);
			System.out.println(str1);
			
			String str2 = new String(bt2);
			System.out.println(str2);
			
			String str3 = new String(bt2,"UTF-16");
			System.out.println(str3);
			
			byte[] bt3 = bt2;
			bt3[bt3.length-1]=0;
			bt3[bt3.length-2]=0;
			String str4 = new String(bt3,"UTF-16");
			System.out.println(str4);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
