package JavaPractice01.db.POS;

import JavaPractice01.db.POS.Item;
import JavaPractice01.db.POS.ItemDAO;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

public class POS_StockManagement extends JPanel implements ActionListener {
    private JLabel labelName;
    private JTable jtableStock;
    private JButton buttonRegister;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonDB;

    public POS_StockManagement() {

        setLayout(null);
        //재고현황
        labelName = new JLabel("재고현황");
        labelName.setSize(100, 40);
        labelName.setLocation(30, 20);


        //테이블
        DefaultTableModel model = new DefaultTableModel() {
            //jtable �����Ұ����ϰ� �ϱ�
            public boolean isCellEditable(int i, int c) {
                return false;
            }
        };
        
        model.addColumn("id");
        model.addColumn("상품명");
        model.addColumn("상품가");
        model.addColumn("재고");
        jtableStock = new JTable(model);
        jtableStock.setBounds(200, 20, 300, 280);

        buttonDB = new JButton("새로고침");
        buttonDB.setBounds(10, 70, 150, 40);

        buttonRegister = new JButton("추가");
        buttonRegister.setBounds(10, 130, 150, 40);

        buttonUpdate = new JButton("수정");
        buttonUpdate.setBounds(10, 190, 150, 40);

        buttonDelete = new JButton("삭제");
        buttonDelete.setBounds(10, 250, 150, 40);


        //Stock ��ǰ��
        add(labelName);
        add(jtableStock);
        add(buttonDB);
        add(buttonRegister);
        add(buttonUpdate);
        add(buttonDelete);

        buttonDB.addActionListener(this);
        buttonRegister.addActionListener(this);
        buttonUpdate.addActionListener(this);
        buttonDelete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        DefaultTableModel model = (DefaultTableModel) jtableStock.getModel();
        if (obj == buttonDB) {
            try {
                loadDB(model);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (obj == buttonRegister) {
            String text = buttonRegister.getText();
            StockWindow window = new StockWindow(text);
        } else if (obj == buttonUpdate) {

            int row = jtableStock.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "DB�ҷ����� �ʾҰų�  ���� �������� �ʾҽ��ϴ�", "���!!", JOptionPane.WARNING_MESSAGE);

            } else {
                System.out.println(row);
                String text = buttonUpdate.getText();

                String id = (String) jtableStock.getValueAt(row, 0);
                String name = (String) jtableStock.getValueAt(row, 1);
                String stock = (String) jtableStock.getValueAt(row, 2);
                String value = (String) jtableStock.getValueAt(row, 3);

                Item item = new Item();

                item.setId(Integer.parseInt(id));
                item.setItem_name(name);
                item.setItem_stock(Integer.parseInt(stock));
                item.setItem_price(Integer.parseInt(value));

                StockWindow window = new StockWindow(text, item);
            }
        } else if (obj == buttonDelete) {
            int row = jtableStock.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "DB�ҷ����� �ʾҰų�  ���� �������� �ʾҽ��ϴ�", "���!!", JOptionPane.WARNING_MESSAGE);

            } else {
                System.out.println(row);
                String text = buttonDelete.getText();

                String id = (String) jtableStock.getValueAt(row, 0);
                String name = (String) jtableStock.getValueAt(row, 1);
                String stock = (String) jtableStock.getValueAt(row, 2);
                String value = (String) jtableStock.getValueAt(row, 3);

                Item item = new Item();

                item.setId(Integer.parseInt(id));
                item.setItem_name(name);
                item.setItem_stock(Integer.parseInt(stock));
                item.setItem_price(Integer.parseInt(value));

                StockWindow window = new StockWindow(text, item);
                window.textFieldname.setEditable(false);
                window.textFieldStock.setEditable(false);
                window.textFieldPrice.setEditable(false);


            }
        }

    }

    // DB 로드
    private void loadDB(DefaultTableModel model) throws SQLException {
        Vector<Item> itemlist = ItemDAO.getInstance().getAllItem();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Item item : itemlist) {
            System.out.println(model.getRowCount());
            String item_id = String.valueOf(item.getId());
            String item_name = item.getItem_name();
            String item_stock = String.valueOf(item.getItem_stock());
            String item_price = String.valueOf(item.getItem_price());
            Vector<String> in = makeInVector(new String[]{item_id, item_name, item_stock, item_price});
            model.addRow(in);
        }
    }

    //String�� vector�� ��ȯ
    private Vector<String> makeInVector(String[] array) {
        Vector<String> in = new Vector<>();
        for (String data : array) {
            in.add(data);
        }
        return in;
    }
}
