package JavaPractice01.db;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class JDBCTable1 extends JFrame{
    static Container cp;
    public JDBCTable1(){
        String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };
        Object rowData[][] = { { 1, "맛동산", 100, "오리온" },
                { 2, "아폴로", 200, "불량식품" },
                { 3, "칸쵸코", 300, "과자계의 레전드" } };
        Object[] temp = { 4, "쵸코송이", 400, "식물계의 절대강자" };
        JTable jt;

        setTitle("TABLE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new FlowLayout());
        DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
        jt = new JTable(dtm);
        dtm.addRow(temp);
        dtm.removeRow(1);
        System.out.println(dtm.getRowCount());
        System.out.println(dtm.getColumnCount());
        dtm.setValueAt("Omen", 1, 1);
        cp.add(new JScrollPane(jt));

        pack();
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JDBCTable1();
    }
}
