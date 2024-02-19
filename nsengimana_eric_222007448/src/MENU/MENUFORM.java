package MENU;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import entityForms.CustomerForm;

import entityForms.Paymentform;
import entityForms.ProductOrderform;
import entityForms.ProductsForm;

import entityForms.SellForms;
import entityForms.VendorForm;

public class MENUFORM extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JMenuBar menuBar;
    
    private JMenu customerMenu;
    private JMenu paymentMenu;
    private JMenu productOrderMenu;
    private JMenu productsMenu;
    private JMenu SellMenu;
    private JMenu vendorMenu;
    private JMenu logoutMenu;

    private JMenuItem customerItem;
    private JMenuItem paymentItem;
    private JMenuItem productOrderItem;
    private JMenuItem productsItem;
    private JMenuItem SellItem;
    private JMenuItem vendorItem;
    private JMenuItem logoutItem;

    private String loggedInUser;

    public MENUFORM(String username) {
        this.loggedInUser = username;
        setTitle("Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create menu bar
        menuBar = new JMenuBar();

        // Create menu items
        customerMenu = new JMenu("Customer");
        customerItem = new JMenuItem("Customer Form");
        customerItem.addActionListener(this);

        paymentMenu = new JMenu("Payment");
        paymentItem = new JMenuItem("Payment Form");
        paymentItem.addActionListener(this);

        productOrderMenu = new JMenu("Product Order");
        productOrderItem = new JMenuItem("Product Order Form");
        productOrderItem.addActionListener(this);

        productsMenu = new JMenu("Products");
        productsItem = new JMenuItem("Products Form");
        productsItem.addActionListener(this);

        SellMenu = new JMenu("Sell");
        SellItem = new JMenuItem("Sell Form");
        SellItem.addActionListener(this);

        vendorMenu = new JMenu("Vendor");
        vendorItem = new JMenuItem("Vendor Form");
        vendorItem.addActionListener(this);

        logoutMenu = new JMenu("Logout");
        logoutItem = new JMenuItem("Logout");
        logoutItem.addActionListener(this);

        // Add menu items to respective menus
        customerMenu.add(customerItem);
        paymentMenu.add(paymentItem);
        productOrderMenu.add(productOrderItem);
        productsMenu.add(productsItem);
        SellMenu.add(SellItem);
        vendorMenu.add(vendorItem);
        logoutMenu.add(logoutItem);

        // Add menus to menu bar
        menuBar.add(customerMenu);
        menuBar.add(paymentMenu);
        menuBar.add(productOrderMenu);
        menuBar.add(productsMenu);
        menuBar.add(SellMenu);
        menuBar.add(vendorMenu);
        menuBar.add(logoutMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);

        // Initialize dashboard panel
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new BorderLayout());

        // Add components to dashboard panel
        JLabel titleLabel = new JLabel("WELCOME " + loggedInUser + " TO THE PRODUCT DELIVERY APP SYSTEM");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        dashboardPanel.add(titleLabel, BorderLayout.CENTER);

        // Add dashboard panel to frame
        add(dashboardPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == customerItem) {
            new CustomerForm();
            
        } else if (e.getSource() == paymentItem) {
            new Paymentform();
            
        } else if (e.getSource() == productOrderItem) {
            new ProductOrderform();
            
        } else if (e.getSource() == productsItem) {
            new ProductsForm();
            
        } else if (e.getSource() == SellItem) {
            new SellForms();
            
        } else if (e.getSource() == vendorItem) {
            new VendorForm();
            
        } else if (e.getSource() == logoutItem) {
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new MENUFORM("TO product_delivery_app_system"));
    }
}
