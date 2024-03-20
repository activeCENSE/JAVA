package JavaPractice01.abstact;

public interface Gamer {
    final int GAME_MAX_LEVEL = 30; //final 생략가능(자동으로 상수변환)
    final String JOB = "프로게이머";
    String GAME_RANK = "플래티넘";
    abstract void doGame(); //public, abstract 생략가능(자동으로 추상메소드, public 변환)

}
