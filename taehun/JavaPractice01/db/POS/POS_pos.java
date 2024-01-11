package JavaPractice01.db.POS;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

public class POS_pos extends JPanel implements ActionListener {
    private JLabel labelItemName;
    private JLabel labelItemStock;
    private JComboBox comboBoxItem;
    private JTextField jTextFieldStock;
    private JButton buttonItemAdd;
    private JButton buttonPay;
    private JButton buttonCancer;
    private JTable jTableBasket;
    private JLabel labelTotal;
    private JTextField jTextFieldTotal;
    private JButton buttonRefresh;

    public POS_pos() throws SQLException {
        ItemDAO itemdao = ItemDAO.getInstance();

        //�޺��ڽ� ����
        setLayout(null);
        
        //재고현황
        labelItemName = new JLabel("재고현황");
        labelItemName.setSize(100, 30);
        labelItemName.setLocation(20, 90);

        //재고 업데이트
        DefaultComboBoxModel combomodel = combo_model_update();

        comboBoxItem = new JComboBox(combomodel);
        comboBoxItem.setSize(200, 30);
        comboBoxItem.setLocation(70, 90);


        //��ǰ ����
        labelItemStock = new JLabel("����");
        labelItemStock.setBounds(20, 140, 100, 30);

        //��ǰ ���ż��� �ؽ�Ʈ�ʵ�
        jTextFieldStock = new JTextField();
        jTextFieldStock.setBounds(70, 140, 200, 30);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("��ǰ��");
        model.addColumn("���Ű���");
        model.addColumn("��ǰ����");
        jTableBasket = new JTable(model);
        jTableBasket.setBounds(300, 20, 210, 210);
        jTableBasket.setEnabled(false);

        //��ǰ �Ѱ���
        labelTotal = new JLabel("�Ѱ���");
        labelTotal.setBounds(20, 250, 100, 40);
        jTextFieldTotal = new JTextField();
        jTextFieldTotal.setBounds(70, 250, 200, 40);
        jTextFieldTotal.setEditable(false);

        //��ٱ��� �߰� ��ư
        buttonItemAdd = new JButton("�߰�");
        buttonItemAdd.setBounds(170, 190, 100, 40);
        
        //��ǰ��� ���ΰ�ħ
        buttonRefresh = new JButton("��ǰ �ҷ�����");
        buttonRefresh.setBounds(20, 20, 140, 40);
        
        //��ٱ��� ���� ��ư
        buttonPay = new JButton("����");
        buttonPay.setBounds(300, 250, 100, 40);

        //�ֹ� ��� ��ư
        buttonCancer = new JButton("���");
        buttonCancer.setBounds(410, 250, 100, 40);


        add(labelItemName);
        add(labelItemStock);
        add(comboBoxItem);
        add(jTextFieldStock);
        add(buttonItemAdd);
        add(buttonRefresh);
        add(buttonPay);
        add(buttonCancer);
        add(jTableBasket);
        add(labelTotal);
        add(jTextFieldTotal);
        //�߰���ư ������
        buttonItemAdd.addActionListener(this);
        buttonRefresh.addActionListener(this);
        buttonCancer.addActionListener(this);
        buttonPay.addActionListener(this);
        //��ҹ�ư

    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        String item = comboBoxItem.getSelectedItem().toString(); //�ʵ忡�� ������ ��������
        String qty = jTextFieldStock.getText(); //������������
        String stockprice = ItemDAO.getInstance().getprice(item);//����ǰ ����
        String stock = ItemDAO.getInstance().getStock(item);//��ǰ��� ����
        DefaultTableModel model = (DefaultTableModel) jTableBasket.getModel();
        DefaultComboBoxModel combomodel = (DefaultComboBoxModel) comboBoxItem.getModel();

        if (obj == buttonItemAdd) {


            int index = model.getRowCount() + 1;
            if (qty.equals("") || item.equals("")) {
                JOptionPane.showMessageDialog(null, "��ǰ�̳� ������ �Է����ּ���", "���!!", JOptionPane.WARNING_MESSAGE);
            } else if (Integer.parseInt(qty) > Integer.parseInt(stock)) {
                JOptionPane.showMessageDialog(null, "��ǰ�� ������ ���� ������ ���� �����ϴ�.", "���!!", JOptionPane.WARNING_MESSAGE);
            } else {
                int price = Integer.parseInt(qty) * Integer.parseInt(stockprice);

                Vector<String> in = makeInVector(new String[]{(String.valueOf(index)), item, qty, String.valueOf(price)});
                int total = 0;
                System.out.println(isCheck(item, model));


                if (!isCheck(item, model)) {
                    JOptionPane.showMessageDialog(null, "�̹� ������ ��ǰ�Դϴ�.", "���!!", JOptionPane.WARNING_MESSAGE);
                } else {
                    //�ߺ��˻��� jtable�� ��� �߰�
                    model.addRow(in);
                }

                //��ٱ��� ���ձ��ϱ�
                for (int i = 0; i < model.getRowCount(); i++) {
                    total = total + Integer.parseInt((String) model.getValueAt(i, 3));
                    jTextFieldTotal.setText(String.valueOf(total));
                }

            }
        } else if (obj == buttonRefresh) { //���ΰ�ħ ��ư Ŭ��
            combomodel.removeAllElements();
            try {
                DefaultComboBoxModel defaultComboBoxModel = combo_model_update();
                System.out.println("defalutCombo size = " + defaultComboBoxModel.getSize());
                System.out.println(defaultComboBoxModel.getElementAt(1));
                for (int i = 0; i < defaultComboBoxModel.getSize(); i++) {
                    String a = (String) defaultComboBoxModel.getElementAt(i);
                    combomodel.addElement(a);
                    System.out.println(combomodel.getElementAt(i));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } else if (obj == buttonCancer) {//��ҹ�ư Ŭ��
            int result;
            result = JOptionPane.showConfirmDialog(null, "�ֹ��� ����Ͻðڽ��ϱ�?");
            //���� ��������
            if (result == 0) {
                clear();
            }
        } else if (obj == buttonPay) { //������ư Ŭ��
            if (jTextFieldTotal.getText().equals("") || jTextFieldTotal.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "��ǰ�� �������ּ���", "���!!", JOptionPane.WARNING_MESSAGE);
            } else {
                int total = Integer.parseInt(jTextFieldTotal.getText()); //�����ؾ��� �ݾ�
                int input; //�����ѱݾ�
                int res; //�Ž�����
                int result;

                result = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?");
                //���� ��������
                if (result == 0) {
                    input = Integer.parseInt(JOptionPane.showInputDialog("�� �ݾ���" + total + "�Դϴ�.\n�󸶸� �����Ͻðڽ��ϱ�?"));
                    System.out.println(input);

                    if (input >= total) {
                        res = input - total;
                        JOptionPane.showMessageDialog(null, "�����Ͻ� �ݾ���" + input + "\n ��ǰ�� �հ��" + total + "\n �Ž�������" + res + "�Դϴ�");

                        System.out.println(res);
                        stock_update(model);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "������ ����Ͽ����ϴ�");

                }

            }
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

    //Jtable�� ��� ��� ����
    private void clear() {
        DefaultTableModel model = (DefaultTableModel) jTableBasket.getModel();
        jTextFieldTotal.setText("");
        jTextFieldStock.setText("");
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

    }

    //�ߺ��˻�
    private boolean isCheck(String text, DefaultTableModel model) {
        boolean check = true;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (text.equals(model.getValueAt(i, 1))) {
                check = false;
            }
        }
        return check;

    }

    //��� ������Ʈ
    private void stock_update(DefaultTableModel model) {
        String out_itemname = null;
        String out_itemstock = null;
        String total_stock;

        for (int i = 0; i < model.getRowCount(); i++) {
            out_itemname = (String) model.getValueAt(i, 1);
            out_itemstock = (String) model.getValueAt(i, 2);
            total_stock = ItemDAO.getInstance().getStock(out_itemname);
            ItemDAO.getInstance().updateStock(total_stock, out_itemstock, out_itemname);
        }
        clear();
    }

    //table ������Ʈ
    private DefaultComboBoxModel combo_model_update() throws SQLException {
        DefaultComboBoxModel combomodel = new DefaultComboBoxModel(ItemDAO.getInstance().getItem());
        return combomodel;
    }
}
