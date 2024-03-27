package JavaPractice01.Interface;

public class SamsungPhone implements Phone{
    @Override
    public void sendCall() {
        System.out.println("뚜루룽~뚜루루~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔숑 !");
    }

    public void flash(){
        System.out.println("플래시가 켜집니다.");
    }

}
