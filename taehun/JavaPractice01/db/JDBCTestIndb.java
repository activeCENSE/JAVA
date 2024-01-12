package JavaPractice01.db;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class JDBCTestIndb extends JFrame{
    static Container cp;
    String columnNames[] = { "학번", "이름", "학과"};
    Object[][] rowData;
    Object[] tempData;
    JTable jt;
    public JDBCTestIndb(){
        Connection conn;
        String url="jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
        String id="root";
        String pwd="asdf4528";
        Statement stmt;
        ResultSet result;
        setTitle("TABLE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new FlowLayout());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("db 연결 성공");

            stmt = conn.createStatement();

            DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
            jt = new JTable(dtm);

            result = stmt.executeQuery("select * from student");

            while (result.next()){
                tempData = new Object[3];
                int hakbun = result.getInt(1);
                String name = result.getString("name");
                String dept = result.getString("dept");
                tempData[0] = hakbun;
                tempData[1] = name;
                tempData[2] = dept;
                dtm.addRow(tempData);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        cp.add(new JScrollPane(jt));
        pack();
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JDBCTestIndb();
    }
}
