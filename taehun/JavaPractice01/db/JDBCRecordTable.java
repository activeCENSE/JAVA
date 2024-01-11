package JavaPractice01.db;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;

public class JDBCRecordTable extends JFrame implements MouseListener, KeyListener {
    private final String[] labels= {"Id","Name","Dept","Score","Grade"};
    private JTextField[] fields = new JTextField[5];

    private JScrollPane scrolledTable;
    private JTable table;
    Object[] tempData;
    private JButton addBtn;
    private JButton delBtn;
    static Container cp;
    public JDBCRecordTable() {
        Connection conn;
        String url="jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
        String id="root";
        String pwd="asdf4528";
        Statement stmt;
        ResultSet result;
        setTitle("TABLE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("db 연결 성공");
            cp = getContentPane();
            this.setLayout(new BorderLayout(10,10));
            JPanel topPanel=new JPanel(new GridLayout(6,4,10,5));

            for(int i=0;i<fields.length;i++) {
                topPanel.add(new JLabel(labels[i]));
                fields[i]=new JTextField(30);
                topPanel.add(fields[i]);
            }
            topPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            this.add("North",topPanel);

            stmt = conn.createStatement();
            DefaultTableModel model=new DefaultTableModel(labels,0);;
            table = new JTable(model);

            result = stmt.executeQuery("select * from student");

            while (result.next()){
                tempData = new Object[5];
                int hakbun = result.getInt(1);
                String name = result.getString("name");
                String dept = result.getString("dept");
                int score = result.getInt(4);
                int grade = result.getInt(5);
                tempData[0] = hakbun;
                tempData[1] = name;
                tempData[2] = dept;
                tempData[3] = score;
                tempData[4] = grade;
                model.addRow(tempData);
            }

            scrolledTable = new JScrollPane(table);
            scrolledTable.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            this.add("Center",scrolledTable);

            JPanel rightPanel=new JPanel(new GridLayout(5,1,10,10));
            addBtn=new JButton("추가");
            delBtn=new JButton("삭제");
            rightPanel.add(addBtn);
            rightPanel.add(delBtn);
            rightPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

            this.add("East",rightPanel);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(620,400);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

            addBtn.addMouseListener(this);
            delBtn.addMouseListener(this);
            for(int i=0;i<fields.length;i++)
                fields[i].addKeyListener(this);
            table.addMouseListener(this);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    private boolean isInvalidInput(String input) {
        return input==null||input.length()==0;
    }

    public void removeRecord(int index) {
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        if(index<0) {
            if(table.getRowCount()==0)
                return;
            index=0;
        }
        model.removeRow(index);
    }
    public void addRecord() {
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        String []record=new String[5];
        for(int i=0;i< record.length;i++) {
            if(isInvalidInput(fields[i].getText())) {
                System.out.println("Invalid Input");
                return;
            }
            record[i]=fields[i].getText();
        }
        model.addRow(record);

        for(int i=0;i<5;i++)
            fields[i].setText("");

        fields[0].requestFocus();
    }

    public void printCell(int row,int col) {
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        System.out.println(model.getValueAt(row, col));
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode==KeyEvent.VK_ENTER) {
            addRecord();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object src=e.getSource();
        if(src==addBtn)
            addRecord();

        if(src==delBtn) {
            int selected=table.getSelectedRow();
            removeRecord(selected);
        }

        if(src==table) {
            int row=table.getSelectedRow();
            int col=table.getSelectedColumn();
            printCell(row,col);
        }

    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    public static void main(String[] args) {
        new JDBCRecordTable();
    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
