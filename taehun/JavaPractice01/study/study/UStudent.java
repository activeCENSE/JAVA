package JavaPractice01.study.study;

public class UStudent extends Student{
    private char grade;
    private String major;

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public char getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }
}
