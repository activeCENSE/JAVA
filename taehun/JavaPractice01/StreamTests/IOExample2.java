package JavaPractice01.StreamTests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class IOExample2 {
    public static void main(String[] args) throws IOException {
        byte[] inSrc = {11, 2, 3, 4, 6, 13};
        byte[] outSrc = null;
        byte[] outSrc1 = new byte[inSrc.length];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        input.read(outSrc1, 0, outSrc1.length); // outSrc1 === inSrc.length - 시간 복잡도면에서 우수, 메모리 사용량에는 별 차이 없음.
        output.write(outSrc1, 2, 4);
        outSrc = output.toByteArray();

        System.out.println("input :" + Arrays.toString(inSrc));
        System.out.println("output :" + Arrays.toString(outSrc));
        System.out.println("output :" + Arrays.toString(outSrc1));

    }
}
