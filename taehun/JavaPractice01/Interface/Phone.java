package JavaPractice01.Interface;

public interface Phone {
    int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){ //default 메소드 (인터페이스에 코드가 작성된 메소드는 Default)
        System.out.println("**phone**");
    }
}
