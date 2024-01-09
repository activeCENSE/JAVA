package JavaPractice01.GUI;

import javax.swing.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        setLayout(null); //배치 관리자 삭제
        JLabel a = new JLabel("Gello");
        a.setSize(100, 20);
        a.setLocation(100, 50);
        add(a);

    }
}
