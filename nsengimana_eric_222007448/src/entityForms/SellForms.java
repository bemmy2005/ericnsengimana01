package entityForms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entities.Sell;


public class SellForms implements ActionListener {
    
    JFrame frame;
    JLabel sid_lb = new JLabel("sid");
    JLabel sdate_lb = new JLabel("sdate");
    JLabel vid_lb = new JLabel("vid");
    JLabel orid_lb = new JLabel("orid");
    JLabel productname_lb = new JLabel("productname");
    JLabel admin_lb = new JLabel("admin");
    JTextField orid_txf = new JTextField();
    JTextField sid_txf = new JTextField();
    JTextField sdate_txf = new JTextField();
    JTextField vid_txf = new JTextField();
    JTextField productname_txf = new JTextField();
    JTextField admin_txf = new JTextField();

    // Buttons CRUD
    JButton insert_btn = new JButton("INSERT");
    JButton Read_btn = new JButton("VIEW");
    JButton update_tbtn = new JButton("UPDATE");
    JButton delete_btn = new JButton("DELETE");
    JButton reset_btn = new JButton("RESET");
    JButton home_tbtn = new JButton("HOME");
    JButton about_btn = new JButton("ABOUT US");

    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = (int) screensize.getWidth();
    int h = (int) screensize.getHeight();

    public void sellForms() {
        createForm();
    }

    private void createForm() {
        frame = new JFrame();
        frame.setTitle("Sell FORM");
        frame.setBounds(10, 10, 400, 400);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        setLocationandSize();
    }

    private void setLocationandSize() {
    	sid_lb.setBounds(10, 10, 120, 30);
    	sdate_lb.setBounds(10, 50, 120, 30);
    	vid_lb.setBounds(10, 90, 120, 30);
        orid_lb.setBounds(10, 130, 120, 30);
        productname_lb.setBounds(10, 170, 120, 30);
        admin_lb.setBounds(10, 210, 100, 30);
        
        sid_txf.setBounds(160, 10, 200, 30);
        sdate_txf.setBounds(160, 50, 200, 30);
        vid_txf.setBounds(160, 90, 200, 30);
        orid_txf .setBounds(160, 130, 200, 30);
       productname_txf.setBounds(160, 170, 200, 30);
        admin_txf.setBounds(160, 210, 200, 30);

        // Buttons CRUD
        insert_btn.setBounds(10, 250, 85, 30);
        Read_btn.setBounds(100, 250, 85, 30);
        update_tbtn.setBounds(190, 250, 85, 30);
        delete_btn.setBounds(280, 250, 85, 30);
        reset_btn.setBounds(390, 10, 100, 30);
        home_tbtn.setBounds(390, 50, 100, 30);
        about_btn.setBounds(390, 90, 100, 30);
        setFontforall();
        addcomponentforFrame();
    }

    private void setFontforall() {
        Font font = new Font("Georgia", Font.BOLD, 18);

        sdate_lb.setFont(font);
        sid_lb.setFont(font);
        vid_lb.setFont(font);
        orid_lb.setFont(font);
        productname_lb.setFont(font);
        admin_lb.setFont(font);

        // Buttons CRUD
        Font fonti = new Font("Courier New", Font.ITALIC, 12);

        insert_btn.setFont(fonti);
        Read_btn.setFont(fonti);
        update_tbtn.setFont(fonti);
        delete_btn.setFont(fonti);
        reset_btn.setFont(fonti);
        home_tbtn.setFont(fonti);
        about_btn.setFont(fonti);

    }

    private void addcomponentforFrame() {
    	frame.add(sid_lb);
        frame.add(sdate_lb);
        frame.add(vid_lb);
        frame.add(orid_lb);
        frame.add(productname_lb);
        frame.add(admin_lb);

        // text
        frame.add(orid_txf);
        frame.add(sid_txf);
        frame.add(sdate_txf);
        frame.add(vid_txf);
        frame.add(productname_txf);
        frame.add(admin_txf);

        // Buttons CRUD
        frame.add(insert_btn);
        frame.add(Read_btn);
        frame.add(update_tbtn);
        frame.add(delete_btn);
        frame.add(reset_btn);
        frame.add(home_tbtn);
        frame.add(about_btn);
        ActionEvent();
    }
    private <insertbtn, delete_btn> void ActionEvent() {
		insert_btn.addActionListener(this);
		Read_btn.addActionListener(this);
		update_tbtn.addActionListener(this);
		delete_btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	Sell sell=new Sell();
		if(e.getSource()==insert_btn) {
			sell.setOrdate(sdate_txf.getText());
			sell.setVid(vid_txf.getText());
			sell.setOrid(orid_txf.getText());
			sell.setProductName(productname_txf.getText());
			sell.setAdmid(admin_txf.getText());
			sell.insertData();
		}else if (e.getSource()==Read_btn) {
			int id=Integer.parseInt(sid_txf.getText());
			sell.readWithID(id);
			sid_txf.setText(String.valueOf(sell.getSid()));
			orid_txf.setText(sell.getOrid());
				sdate_txf.setText(sell.getOrdate());
				vid_txf.setText(sell.getVid());
				 productname_txf.setText(sell.getProductName());
				admin_txf.setText(sell.getAdmid());
				
	           }else if (e.getSource()==update_tbtn) {
				int id=Integer.parseInt(sid_txf.getText());
				
				sell.setOrdate(sdate_txf.getText());
				sell.setVid(vid_txf.getText());
				sell.setOrid(orid_txf.getText());
				sell.setProductName(productname_txf.getText());
				sell.setAdmid(admin_txf.getText());
				sell.update(id);
			      }else {
				int id=Integer.parseInt(sid_txf.getText());
				sell.delete(id);
				}
		}

    public static void main(String[] args) {
        SellForms sellForm = new SellForms();
        sellForm.sellForms();
    }

}

