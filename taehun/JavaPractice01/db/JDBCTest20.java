package JavaPractice01.db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JDBCTest20 extends JFrame {
    private JTextField tf = new JTextField(20);
    private  JTextField t1 = new JTextField(20);
    private  JTextField t2 = new JTextField(20);
    private  JTextField t3 = new JTextField(20);
    static Connection conn;
    static Statement stmt;
    static ResultSet result;
    static String sql;
    public JDBCTest20(){
        setTitle("입력창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 2, 1,2 ));
        JLabel hakbun = new JLabel("학번");
        JLabel name = new JLabel("이름");
        JLabel dept = new JLabel("학과");
        JButton btn = new JButton("찾기");
        cp.add(hakbun);
        cp.add(t1);
        cp.add(name);
        cp.add(t2);
        cp.add(dept);
        cp.add(t3);
        cp.add(tf);
        cp.add(btn);
        btn.addActionListener(new MyActionListener());
        setSize(400, 400);
        setVisible(true);
    }

    public class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String url="jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
            String id="root";
            String pwd="asdf4528";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, id, pwd);
                System.out.println("db 연결 성공");
                sql = "select id, name, dept from student where id="+tf.getText();
                tf.setText("");
                stmt = conn.createStatement();
                result = stmt.executeQuery(sql);
                if(result.next()){
                    int hakbun = result.getInt(1);
                    String name = result.getString("name");
                    String dept = result.getString("dept");
                    t1.setText(String.valueOf(hakbun));
                    t2.setText(name);
                    t3.setText(dept);
                } else {
                    t1.setText("없어요");
                    t2.setText("");
                    t3.setText("");
                    tf.setText("");
                }
                result.close();
                stmt.close();
                conn.close();
            } catch (ClassNotFoundException exc){
                System.out.println("드라이버 로드중 에러");

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public static void main(String[] args) {
        new JDBCTest20();
    }
}
