package JavaPractice01.study.study;

public class Code1204_3 {
    public static void main(String[] args) {
        UStudent us = new UStudent();

        us.setName("홍길동");
        us.setSchoolName("울과대");
        us.setMajor("컴퓨터IT학부");
        us.setScore(4);
        us.setGrade('A');

        System.out.println(us.getName());
        System.out.println(us.getSchoolName());
        System.out.println(us.getMajor());
        System.out.println(us.getMajor());
        System.out.println(us.getScore());
        System.out.println(us.getGrade());
    }
}
