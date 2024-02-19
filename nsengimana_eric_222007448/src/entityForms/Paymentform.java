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

import entities.Payment;
	public class Paymentform implements ActionListener{ 
		JFrame frame;
		     JLabel payid_lb=new JLabel("pay_id");
				JLabel paydate_lb=new JLabel("paydate");
				JLabel pamount_lb=new JLabel(" pamount");
				JLabel pmethod_lb=new JLabel("pmethod");
				JLabel orid_lb=new JLabel("orid");
				JLabel pay_status_lb=new JLabel("pay_status");
				JLabel cid_lb=new JLabel("cid");
				JLabel phone_lb=new JLabel("phone");
			    JTextField payid_txf=new JTextField();
				JTextField paydate_txf=new JTextField();
				JTextField pamount_txf=new JTextField();
				JTextField pmethod_txf=new JTextField();
				JTextField orpayid_txf=new JTextField();
				JTextField pay_status_txf=new JTextField();
				JTextField cpayid_txf=new JTextField();
				JTextField phone_txf=new JTextField();
				
				//Buttons CRUD
				
				JButton pay_btn=new JButton("PAY");
				JButton view_btn=new JButton("VIEW");
				JButton update_tbtn=new JButton("UPDATE");
				JButton remove_tbtn=new JButton("REMOVE");
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				int w=(int) screensize.getWidth();
				int h=(int) screensize.getHeight();
				 public Paymentform() {
					
					createForm();

				}
				private <cancelbtn, delete_btn> void ActionEvent() {
				pay_btn.addActionListener(this);
				view_btn.addActionListener(this);
				update_tbtn.addActionListener(this);
				remove_tbtn.addActionListener(this);	
				}	
				private void createForm() {
					frame=new JFrame();
					frame.setTitle("PAYMENT FORM");
					frame.setBounds(10, 10, 450, 420);
					frame.getContentPane().setLayout(null);
					frame.getContentPane().setBackground(Color.LIGHT_GRAY);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(true);
					setLocationandSize();
				}


				private void setLocationandSize() {
					payid_lb.setBounds(10, 10, 120, 30);
					paydate_lb.setBounds(10, 50, 120, 30);
					pamount_lb.setBounds(10, 90, 120, 30);
					pmethod_lb.setBounds(10, 130, 100, 30);
					orid_lb.setBounds(10, 170, 100, 30);
					pay_status_lb.setBounds(10, 210, 120, 30);
					cid_lb.setBounds(10, 250, 100, 30);
					phone_lb.setBounds(10, 290, 100, 30);
					payid_txf.setBounds(160, 10, 200, 30);
					paydate_txf.setBounds(160, 50, 200, 30);
					pamount_txf.setBounds(160, 90, 200, 30);
					pmethod_txf.setBounds(160, 130, 200, 30);
					orpayid_txf.setBounds(160, 170, 200, 30);
					pay_status_txf.setBounds(160, 210, 200, 30);
					cpayid_txf.setBounds(160, 250, 200, 30);
					phone_txf.setBounds(160, 290, 200, 30);
					    //Buttons CRUD
					pay_btn.setBounds(10,330, 85, 30);
					view_btn.setBounds(100,330, 85, 30);
					update_tbtn.setBounds(190,330, 100, 30);
					remove_tbtn.setBounds(300,330, 100, 30);
					setFontforall();
					addcomponentforFrame();
					}
				private void setFontforall() {
					Font font = new Font("Georgia", Font.BOLD, 18);

					payid_lb.setFont(font);
					paydate_lb.setFont(font);
					pamount_lb.setFont(font);
					pmethod_lb.setFont(font);
					pmethod_lb.setFont(font);
					orid_lb.setFont(font);
					pay_status_lb.setFont(font);
					cid_lb.setFont(font);
					phone_lb.setFont(font);
				
					payid_txf.setFont(font);
					paydate_txf.setFont(font);
					pamount_txf.setFont(font);
					pmethod_txf.setFont(font);
					orpayid_txf.setFont(font);
					pay_status_txf.setFont(font);
					cpayid_txf.setFont(font);
					phone_txf.setFont(font);
					//Buttons CRUD
					Font fonti = new Font("Courier New", Font.ITALIC, 12);

					pay_btn.setFont(fonti);
					view_btn.setFont(fonti);
					update_tbtn.setFont(fonti);
					remove_tbtn.setFont(fonti);

				}
			
				private void addcomponentforFrame() {
					frame.add(payid_lb);
					frame.add(paydate_lb);
					frame.add(pamount_lb);
					frame.add(pmethod_lb);
					frame.add(orid_lb);
					frame.add(pay_status_lb);
					frame.add(cid_lb);
					frame.add(phone_lb);
	
					//text
					frame.add(payid_txf);
					frame.add(paydate_txf);
					frame.add(pamount_txf);
					frame.add(pmethod_txf);
					frame.add(orpayid_txf);
					frame.add(pay_status_txf);
					frame.add(cpayid_txf);
					frame.add(phone_txf);
				
					//Buttons CRUD
					frame.add(pay_btn);
					frame.add(view_btn);
					frame.add(update_tbtn);
					frame.add(remove_tbtn);
					ActionEvent();
				}
				@Override
			   public void actionPerformed(ActionEvent e) {
					Payment pay=new Payment();
					if(e.getSource()==pay_btn) {
						pay.setpaydate(paydate_txf.getText());
						pay.setpamount(pamount_txf.getText());
						pay.setpmethod(pmethod_txf.getText());
						pay.setorid(orpayid_txf.getText());
						pay.setpay_status(pay_status_txf.getText());
						pay.setcid(cpayid_txf.getText());
						pay.setphone(phone_txf.getText());
						pay.insertData();
					}else if (e.getSource()==view_btn) {
						int id=Integer.parseInt(payid_txf.getText());
						pay.readWithID(id);
						payid_txf.setText(String.valueOf(pay.getpayid()));
						paydate_txf.setText(pay.getpaydate());
						pamount_txf.setText(pay.getpamount());
						pmethod_txf.setText(pay.getpmethod());
						orpayid_txf.setText(pay.getorid());
						pay_status_txf.setText(pay.getpay_status());
						cpayid_txf.setText(pay.getcid());
						phone_txf.setText(pay.getphone());
					    }else if (e.getSource()==update_tbtn) {
						int id=Integer.parseInt(payid_txf.getText());
						pay.setpaydate(paydate_txf.getText());
						pay.setpamount(pamount_txf.getText());
						pay.setpmethod(pmethod_txf.getText());
						pay.setorid(orpayid_txf.getText());
						pay.setpay_status(pay_status_txf.getText());
						pay.setcid(cpayid_txf.getText());
						pay.setphone(phone_txf.getText());
						pay.update(id);
						}else {
						int id=Integer.parseInt(payid_txf.getText());
						pay.delete(id);}
					}
				public static void main(String[] args) {
				Paymentform Paymentform= new Paymentform();
				System.out.println(Paymentform);
				}}

