package JavaPractice01.Wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        String str = "10";
        String str2 = "10.5";
        String str3 = "true";

        byte b = Byte.parseByte(str);
        int i = Integer.parseInt(str);
        float f = Float.parseFloat(str2);
        long l = Long.parseLong(str);
        short s = Short.parseShort(str);
        boolean bool = Boolean.parseBoolean(str3);

        System.out.println(b + "," + i + "," + s + "," + l + "," + f + "," + bool);
        char c1 = '4', c2 = '가';
        if(Character.isDigit(c1))
            System.out.println(c1 + "은 숫자");
        else
            System.out.println(c1 + "은 문자");
        if(Character.isAlphabetic(c2)) //문자에 해당하는 거냐고 물어보는거임 예) 한글이 true로 나옴 - 근데 느낌표는 문자로 인정안함
            System.out.println(c2 + "은 영문자");
        else
            System.out.println(c2 + "은 영문자 아님");

        System.out.println("---------------------------------");
        System.out.println(Integer.toBinaryString(-28));
        System.out.println(Integer.toHexString(28));
        System.out.println(Integer.bitCount(28));
        System.out.println("---------------------------------");
        Integer ii = Integer.valueOf(123); //불필요한 박싱
        Integer iii = 123;
        System.out.println(iii);
        System.out.println("---------------------------------");
        System.out.println(Boolean.toString(4>10)); //사실 불리언.toString 으로 변환할 이유가 없긴 해

    }
}
