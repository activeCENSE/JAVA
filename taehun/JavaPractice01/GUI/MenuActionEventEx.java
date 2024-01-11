package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame{
    private JLabel imgLabel = new JLabel(); // 빈 이미지를 가진 레이블
    public MenuActionEventEx() {
        setTitle("메뉴 액션 리스너 만들기");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250,200); setVisible(true);
    }

    private void createMenu() { // 메뉴바와 스크린 메뉴 생성 스크린 메뉴에 메뉴 아이템 삽입
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
        JMenuItem[] menuItem = new JMenuItem[3];
        String[] showItemTitle = {"Apple", "Pear", "Cherry"};
        String[] etcItemTitle = {"HideToggle", "Clear", "Exit"};

        JMenu[] screenMenu = new JMenu[2];
        screenMenu[0] = new JMenu("Show");
        screenMenu[1] = new JMenu("ETC");

        // 메뉴 아이템을 ETC 메뉴에 삽입
        MenuActionListener listener = new MenuActionListener(); // Action 리스너 생성
        for(int i=0; i<menuItem.length; i++) {
            menuItem[i] = new JMenuItem(showItemTitle[i]); // 메뉴아이템 생성
            menuItem[i].addActionListener(listener); // 메뉴아이템에 액션 리스너 등록
            screenMenu[0].add(menuItem[i]); // 메뉴아이템을 ETC 메뉴에 삽입
        }
        mb.add(screenMenu[0]); // 메뉴바에 ETC 메뉴삽입

        for(int i=0; i<menuItem.length; i++) {
            menuItem[i] = new JMenuItem(etcItemTitle[i]); // 메뉴아이템 생성
            menuItem[i].addActionListener(listener); // 메뉴아이템에 액션 리스너 등록
            screenMenu[1].add(menuItem[i]); // 메뉴아이템을 ETC 메뉴에 삽입
        }
        mb.add(screenMenu[1]); // 메뉴바에 ETC 메뉴삽입

        setJMenuBar(mb); // 메뉴바를 프레임에 부착
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand(); // 사용자가 선택한 메뉴아이템의 문자열 리턴
            switch(cmd) {
                case "Apple" :
                    if(imgLabel.getIcon() != null){
                        imgLabel.setIcon(null); // 기존 이미지 삭제
                    }
                    imgLabel.setIcon(new ImageIcon("images/apple.jpg")); break;
                case "Pear" :
                    if(imgLabel.getIcon() != null){
                        imgLabel.setIcon(null); // 기존 이미지 삭제
                    }                    imgLabel.setIcon(new ImageIcon("images/pear.jpeg")); break;
                case "Cherry" :
                    if(imgLabel.getIcon() != null){
                        imgLabel.setIcon(null); // 기존 이미지 삭제
                    }
                    imgLabel.setIcon(new ImageIcon("images/cherry.jpg")); break;
                case "HideToggle" :
                    imgLabel.setVisible(!imgLabel.isVisible());
                case "Clear" :
                    if(imgLabel.getIcon() != null){
                        imgLabel.setIcon(null); // 기존 이미지 삭제
                    }
                    break;
                case "Exit" :
                    System.exit(0); break;
            }
        }
    }
    public static void main(String [] args) {
        new MenuActionEventEx();
    }
}
