package JavaPractice01.Interface;

public class InterfaceEx2 {
    public static void main(String[] args) {
        SamsungPhone sp = new SamsungPhone();
        LgPhone lg = new LgPhone();

        sp.sendCall();
        sp.receiveCall();
        sp.flash();
        sp.printLogo();

        lg.sendCall();
        lg.receiveCall();
        lg.record();
        lg.printLogo();

        Phone[] ph = new Phone[5];

    }
}
