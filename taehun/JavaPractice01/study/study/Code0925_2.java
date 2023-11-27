package JavaPractice01.study.study;

public class Code0925_2 {

	public static void main(String[] args) {
		short a = 0x55ff;   //22015
		short b = 0x00ff;   // 255
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("bit 연산");
		System.out.printf("%04x\n", a&b );
		System.out.printf("%04x\n", a|b );
		System.out.printf("%04x\n", a^b );
		System.out.printf("%04x\n", ~a );

		byte c = 20;  //0x14
		byte d = -8;  //0xf8
		System.out.println("shift 연산 결과");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d<<2);
		System.out.println(d>>2);
		System.out.printf("%04x\n", d>>>1 );
	}

}
