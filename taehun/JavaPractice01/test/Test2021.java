package JavaPractice01.test;

public class Test2021 {
    public static void main(String[] args) {
        MyTv t = new MyTv(50,30, true);  //channel:50  volume: 30 전원스위치: on의 의미

        t.setChannel(10);
        System.out.println("현재 채널: "+t.getChannel());  //결과... 현재 채널: 10
        t.setVolume(20);
        t.volumeUp();
        System.out.println("현재 볼륨 "+t.getVolume());  //결과... 현재 볼륨: 21
        t.channelUp();
        System.out.println("현재 채널: "+t.getChannel());  //결과... 현재 채널: 11
        t.setChannel(40);
        System.out.println("현재 채널: "+t.getChannel());  //결과... 현재 채널: 40
        t.gotoPrevChannel();
        System.out.println("현재 채널: "+t.getChannel());  //결과... 현재 채널: 11
    }
}
