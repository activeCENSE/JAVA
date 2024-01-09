package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("all")

public class SwingSampleFrame extends JFrame {
    public SwingSampleFrame() {
        setTitle("파일 예제");
        createMenu();
        createToolBar();
        createSplitPane();
        setSize(500, 400);
        setVisible(true);
    }

    private void createMenu() {
        JMenuBar mb = new JMenuBar(); // �޴��� ����
        mb.add(new JMenu("File")); // �޴��ٿ� �޴��� ����
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Source"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        this.setJMenuBar(mb); // �޴��ٸ� �����ӿ� ����
    }

    private void createToolBar() {
        JToolBar bar = new JToolBar("Kitae Menu"); // ���� ����
        bar.setBackground(Color.LIGHT_GRAY);

        // ���ٿ� ������Ʈ ����
        JButton newBtn = new JButton("New");
        newBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //�޽��� ���̾�α� ����Ͽ� ��ư �������� �˸�
                JOptionPane.showMessageDialog(SwingSampleFrame.this, "new 버튼을 눌렀습니다..",
                        "Message", JOptionPane.ERROR_MESSAGE);
            }
        });
        bar.add(newBtn);



        bar.add(new JButton(new ImageIcon("images/open.jpg")));
        bar.addSeparator();
        bar.add(new JButton(new ImageIcon("images/save.jpg")));
        bar.add(new JLabel("search"));
        bar.add(new JTextField("text field"));
        JComboBox combo = new JComboBox();
        combo.addItem("Java");
        combo.addItem("C#");
        combo.addItem("C");
        combo.addItem("C++");
        bar.add(combo);

        getContentPane().add(bar, BorderLayout.NORTH); // ���ٸ�
    }

    private void createSplitPane() {
        String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
                "peach", "berry", "strawberry", "blackberry"};

        JList scrollList = new JList(fruits);
        JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(scrollList), new JScrollPane(new JLabel(new ImageIcon("images/img1.jpg")))); // JTabbedPane.LEFT
        getContentPane().add(pane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new SwingSampleFrame();
    }
}
