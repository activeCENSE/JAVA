package JavaPractice01.study.study;

import java.io.*;
import java.util.StringTokenizer;

public class Code1204_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int su = Integer.parseInt(br.readLine());
        int[] data = new int[su];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()){
            data[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for(int temp:data){
            bw.write(temp+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
