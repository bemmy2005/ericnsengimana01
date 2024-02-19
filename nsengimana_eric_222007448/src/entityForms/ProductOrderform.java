package entityForms;

import javax.swing.*;

import entities.ProductOrder1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductOrderform implements ActionListener {
    private JFrame frame;
    private JLabel orid_lb = new JLabel("Order ID:");
    private JLabel pid_lb = new JLabel("Product ID:");
    private JLabel ordate_lb = new JLabel("Order Date:");
    private JLabel pquantity_lb = new JLabel("Product Quantity:");
    private JLabel orprice_lb = new JLabel("Order Price:");
    private JLabel cid_lb = new JLabel("Customer ID:");
    private JLabel order_status_lb = new JLabel("Order Status:");

    private JTextField orid_txf = new JTextField();
    private JTextField pid_txf = new JTextField();
    private JTextField ordate_txf = new JTextField();
    private JTextField pquantity_txf = new JTextField();
    private JTextField orprice_txf = new JTextField();
    private JTextField cid_txf = new JTextField();
    private JTextField order_status_txf = new JTextField();

    private JButton insert_btn = new JButton("Insert");
    private JButton read_btn = new JButton("Read");
    private JButton update_btn = new JButton("Update");
    private JButton delete_btn = new JButton("Delete");
    private JButton reset_btn = new JButton("Reset");
    private JButton home_btn = new JButton("Home");
    private JButton about_btn = new JButton("About");

    public ProductOrderform() {
        createForm();
    }

    private void createForm() {
        frame = new JFrame();
        frame.setTitle("PRODUCT_ORDER FORM");
        frame.setBounds(10, 10, 700, 400);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        setLocationAndSize();
    }

    private void setLocationAndSize() {
        orid_lb.setBounds(10, 10, 180, 30);
        ordate_lb.setBounds(10, 50, 180, 30);
        pid_lb.setBounds(10, 90, 180, 30);
        pquantity_lb.setBounds(10, 130, 180, 30);
        orprice_lb.setBounds(10, 170, 180, 30);
        cid_lb.setBounds(10, 210, 180, 30);
        order_status_lb.setBounds(10, 250, 180, 30);

        orid_txf.setBounds(160, 10, 200, 30);
        ordate_txf.setBounds(160, 50, 200, 30);
        pid_txf.setBounds(160, 90, 200, 30);
        pquantity_txf.setBounds(160, 130, 200, 30);
        orprice_txf.setBounds(160, 170, 200, 30);
        cid_txf.setBounds(160, 210, 200, 30);
        order_status_txf.setBounds(160, 250, 200, 30);

        // Buttons CRUD
        insert_btn.setBounds(10, 290, 85, 30);
        read_btn.setBounds(100, 290, 85, 30);
        update_btn.setBounds(190, 290, 85, 30);
        delete_btn.setBounds(280, 290, 85, 30);
        reset_btn.setBounds(390, 290, 85, 30);
        home_btn.setBounds(500, 290, 85, 30);
        about_btn.setBounds(590, 290, 85, 30);
        setFontForAll();
        addComponentsForFrame();
    }

    private void setFontForAll() {
        Font font = new Font("Arial", Font.BOLD, 14);
        orid_lb.setFont(font);
        pid_lb.setFont(font);
        ordate_lb.setFont(font);
        pquantity_lb.setFont(font);
        orprice_lb.setFont(font);
        cid_lb.setFont(font);
        order_status_lb.setFont(font);

        // Buttons CRUD
        Font fonti = new Font("Arial", Font.PLAIN, 12);

        insert_btn.setFont(fonti);
        read_btn.setFont(fonti);
        update_btn.setFont(fonti);
        delete_btn.setFont(fonti);
        reset_btn.setFont(fonti);
        home_btn.setFont(fonti);
        about_btn.setFont(fonti);
    }

    private void addComponentsForFrame() {
        frame.add(orid_lb);
        frame.add(pid_lb);
        frame.add(ordate_lb);
        frame.add(pquantity_lb);
        frame.add(orprice_lb);
        frame.add(cid_lb);
        frame.add(order_status_lb);

        // Text
        frame.add(orid_txf);
        frame.add(ordate_txf);
        frame.add(pid_txf);
        frame.add(pquantity_txf);
        frame.add(orprice_txf);
        frame.add(cid_txf);
        frame.add(order_status_txf);

        // Buttons CRUD
        frame.add(insert_btn);
        frame.add(read_btn);
        frame.add(update_btn);
        frame.add(delete_btn);
        frame.add(reset_btn);
        frame.add(home_btn);
        frame.add(about_btn);
        addActionEvent();
    }

    private void addActionEvent() {
        insert_btn.addActionListener(this);
        read_btn.addActionListener(this);
        update_btn.addActionListener(this);
        delete_btn.addActionListener(this);
        reset_btn.addActionListener(this);
        home_btn.addActionListener(this);
        about_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	ProductOrder1 productOrder = new ProductOrder1();
        if (e.getSource() == insert_btn) {
            productOrder.setOrdate(ordate_txf.getText());
            productOrder.setPid(pid_txf.getText());
            productOrder.setPquantity(pquantity_txf.getText());
            productOrder.setOrdate(orprice_txf.getText());
            productOrder.setCid(cid_txf.getText());
            productOrder.setOrder_status(order_status_txf.getText());
            productOrder.insertData();
        } else if (e.getSource() == read_btn) {
            int id = Integer.parseInt(orid_txf.getText());
            productOrder.readwithID(id);
            orid_txf.setText(String.valueOf(productOrder.getOrid()));
            ordate_txf.setText(productOrder.getOrdate());
            pid_txf.setText(productOrder.getPid());
            pquantity_txf.setText(productOrder.getPquantity());
            orprice_txf.setText(productOrder.getorprice());
            cid_txf.setText(productOrder.getCid());
            order_status_txf.setText(productOrder.getOrder_status());
        } else if (e.getSource() == update_btn) {
            int id = Integer.parseInt(orid_txf.getText());
            productOrder.setOrdate(ordate_txf.getText());
            productOrder.setPid(pid_txf.getText());
            productOrder.setPquantity(pquantity_txf.getText());
            productOrder.setOrdate(orprice_txf.getText());
            productOrder.setCid(cid_txf.getText());
            productOrder.setOrder_status(order_status_txf.getText());
            productOrder.update(id);
        } else if (e.getSource() == delete_btn) {
            int id = Integer.parseInt(orid_txf.getText());
            productOrder.delete(id);
        } else if (e.getSource() == reset_btn) {
            resetForm();
        } else if (e.getSource() == home_btn) {
            // Handle home button action
        } else if (e.getSource() == about_btn) {
            // Handle about button action
        }
    }

    private void resetForm() {
        orid_txf.setText("");
        ordate_txf.setText("");
        pid_txf.setText("");
        pquantity_txf.setText("");
        orprice_txf.setText("");
        cid_txf.setText("");
        order_status_txf.setText("");
    }

    public static void main(String[] args) {
        new ProductOrderform();
    }
}
