package JavaPractice01.db.POS;

import DB.Item;
import DB.ItemDAO;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StockWindow extends JFrame implements ActionListener {
	JLabel labelId = new JLabel("     id");
    JLabel labelname = new JLabel("     ��ǰ��");
    JLabel labelStock = new JLabel("     ���");
    JLabel labelPrice = new JLabel("     ����");
    JTextField textFieldlId = new JTextField(10);
    JTextField textFieldname = new JTextField(10);
    JTextField textFieldStock = new JTextField(10);
    JTextField textFieldPrice = new JTextField(10);
    JButton buttonaccept = new JButton("");
    Item item;
    String text;

    public StockWindow(String text) {
        super(text);
        this.text = text;
        display();
        setSize(300, 300);
        setVisible(true);
    }

    public StockWindow(String text, Item item) {
        super(text);
        this.item = item;
        this.text = text;
        display();
        setSize(300, 300);
        setVisible(true);
    }

    public void display() {
        Container c = getContentPane();
        JPanel p = new JPanel(new GridLayout(4, 2));
        buttonaccept.setText(text);
        textFieldlId.setEditable(false);

        // item bean�� null�� �ƴҰ��
        if (item != null) {
            textFieldlId.setText(String.valueOf(item.getId()));
            textFieldname.setText(item.getItem_name());
            textFieldStock.setText(String.valueOf(item.getItem_stock()));
            textFieldPrice.setText(String.valueOf(item.getItem_price()));
        }
        c.add(p, BorderLayout.CENTER);
        c.add(buttonaccept, BorderLayout.SOUTH);

        p.add(labelId);
        p.add(textFieldlId);

        p.add(labelname);
        p.add(textFieldname);

        p.add(labelStock);
        p.add(textFieldStock);

        p.add(labelPrice);
        p.add(textFieldPrice);

        c.add(p, BorderLayout.CENTER);
        c.add(buttonaccept, BorderLayout.SOUTH);

        buttonaccept.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String state = buttonaccept.getText();
        String id;
        String name;
        String stock;
        String price;
        boolean result;

        switch (state) {
            case "���":

                name = textFieldname.getText();
                stock = textFieldStock.getText();
                price = textFieldPrice.getText();
                Item register = new Item();
                register.setItem_name(name);
                register.setItem_stock(Integer.parseInt(stock));
                register.setItem_price(Integer.parseInt(price));

                result = ItemDAO.getInstance().insertStock(register);

                System.out.println("Window = " + result);
                break;
            case "����":
                id = textFieldlId.getText();
                name = textFieldname.getText();
                stock = textFieldStock.getText();
                price = textFieldPrice.getText();

                item.setId(Integer.parseInt(id));
                item.setItem_name(name);
                item.setItem_stock(Integer.parseInt(stock));
                item.setItem_price(Integer.parseInt(price));

                result = ItemDAO.getInstance().updateitem(item);
                if (result) {
                    JOptionPane.showMessageDialog(null, "������ �����Ͽ����ϴ�", "����", JOptionPane.INFORMATION_MESSAGE);

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "������ �����Ͽ����ϴ� �Էµ� ���� Ȯ�� �ϼ���", "���!!", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case "����":
                id = textFieldlId.getText();
                name = textFieldname.getText();
                stock = textFieldStock.getText();
                price = textFieldPrice.getText();

                item.setId(Integer.parseInt(id));
                item.setItem_name(name);
                item.setItem_stock(Integer.parseInt(stock));
                item.setItem_price(Integer.parseInt(price));


                int res;

                res = JOptionPane.showConfirmDialog(null, "������ ��ǰ�� " + name + "�� �����ͺ��̽����� �����Ͻðڽ��ϱ�?");
                //���� ��������
                if (res == 0) {
                    ItemDAO.getInstance().DeleteItem(Integer.parseInt(id));
                    dispose();
                    JOptionPane.showMessageDialog(null, "�����Ϸ��� " + name + "�� \n�����Ͽ����ϴ�.");

                } else {
                    JOptionPane.showMessageDialog(null, "������ ����Ͽ����ϴ�");

                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + state);
        }
    }
}
