package JavaPractice01.study.study;

import java.util.StringTokenizer;

public class Code1204_1 {
    public static void main(String[] args) {
        //String str = "ulsan college, Computer IT";
        String str = "ulsan=052&busan=051&seoul=02";
        StringTokenizer st = new StringTokenizer(str, "&", true);
        System.out.println("가지고 있는 토큰 수 : "+st.countTokens());

        while(st.hasMoreTokens()){
            String to = st.nextToken();
            System.out.println(to);
        }
    }
}
