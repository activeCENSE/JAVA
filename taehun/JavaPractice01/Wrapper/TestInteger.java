package JavaPractice01.Wrapper;

public class TestInteger {
    public static void main(String[] args) {
        Integer i = 123;
        Integer t = Integer.valueOf(123);
        System.out.println(i);
        System.out.println(i.intValue());
        System.out.println(Integer.bitCount(123));
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toHexString(123));

    }
}
