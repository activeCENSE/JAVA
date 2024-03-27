package JavaPractice01.Interface;

public class LgPhone implements Phone{
    @Override
    public void sendCall() {
        System.out.println("대충 클래식 음악~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔쮜~");
    }

    public void record(){
        System.out.println("화면 녹화가 시작되었습니다.");
    }
}
