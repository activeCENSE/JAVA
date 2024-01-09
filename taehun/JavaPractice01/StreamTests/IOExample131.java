package JavaPractice01.StreamTests;

import java.io.File;

public class IOExample131 {
    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
        File[] subFiles = dir.listFiles();

        for (int i = 0; i < subFiles.length; i++) {
            File f = subFiles[i];
            long t = f.lastModified(); // 마지막으로 수정한 시간
            System.out.print(f.getName());
            System.out.print("\t파일 크기: " + f.length()); // 파일의 크기
            System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
        }
    }
    public static void main(String[] args) {
        File f1 = new File("/Users/mac/Desktop/Coding/Java/taehun");
        listDirectory(f1);
        File f2 = new File("/Users/mac/Desktop/Coding/Java/taehun/uc.txt");
        if (!f2.exists()) {
            f2.mkdir();
            System.out.println("uc.txt 파일을 생성했습니다.");
        }
        listDirectory(f1);
        f2.renameTo(new File("/Users/mac/Desktop/Coding/Java/taehun/uc100.txt"));
        listDirectory(f1);
    }
}
