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

import entities.Customer;
public class CustomerForm implements ActionListener{ 
	JFrame frame;
	        JLabel id_lb=new JLabel("Customer_id");
			JLabel lname_lb=new JLabel("Last_name");
			JLabel fname_lb=new JLabel("First name");
			JLabel Email_lb=new JLabel("Email");
			JLabel cont_lb=new JLabel("contact");
			JLabel di_lb=new JLabel("District");
			JLabel se_lb=new JLabel("Sector");
			JLabel ce_lb=new JLabel("Cell");
			JLabel vi_lb=new JLabel("Village");
			JLabel user_lb=new JLabel("Username");
			JLabel pass_lb=new JLabel("Password");
			
			JTextField id_txf=new JTextField();
			JTextField lname_txf=new JTextField();
			JTextField fname_txf=new JTextField();
			JTextField Email_txf=new JTextField();
			JTextField cont_txf=new JTextField();
			JTextField di_txf=new JTextField();
			JTextField se_txf=new JTextField();
			JTextField ce_txf=new JTextField();
			JTextField vi_txf=new JTextField();
			JTextField user_txf=new JTextField();
			JTextField pass_txf=new JTextField();
			
			//Buttons CRUD
			JButton insert_btn=new JButton("INSERT");
			JButton reset_btn=new JButton("RESET");
			JButton home_tbtn=new JButton("HOME");
			JButton View_btn=new JButton("VIEW");
			JButton update_btn=new JButton("UPDETE");
			JButton delete_tbtn=new JButton("DELETE");
			JButton about_btn=new JButton("ABOUT US");
			Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
			int w=(int) screensize.getWidth();
			int h=(int) screensize.getHeight();
			 public CustomerForm() {
				
				createForm();

			
				View_btn.addActionListener(this);
				update_btn.addActionListener(this);
				delete_tbtn.addActionListener(this);
				insert_btn.addActionListener(this);
			}
				private void createForm() {
				frame=new JFrame();
				frame.setTitle("CUSTOMER FORM");
				frame.setBounds(5, 10, 550, 550);
				frame.getContentPane().setLayout(null);
				frame.getContentPane().setBackground(Color.LIGHT_GRAY);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(true);
				setLocationandSize();
			}


			private void setLocationandSize() {
				id_lb.setBounds(10, 10, 120, 30);
				fname_lb.setBounds(10, 50, 120, 30);
				lname_lb.setBounds(10, 90, 120, 30);
				Email_lb.setBounds(10, 130, 100, 30);
				cont_lb.setBounds(10, 170, 100, 30);
				di_lb.setBounds(10, 210, 100, 30);
				se_lb.setBounds(10, 250, 100, 30);
				ce_lb.setBounds(10, 290, 100, 30);
				vi_lb.setBounds(10, 330, 100, 30);
				user_lb.setBounds(10, 370, 100, 30);
				pass_lb.setBounds(10, 410, 100, 30);
				
				id_txf.setBounds(160, 10, 200, 30);
				fname_txf.setBounds(160, 50, 200, 30);
				lname_txf.setBounds(160, 90, 200, 30);
				Email_txf.setBounds(160, 130, 200, 30);
				cont_txf.setBounds(160, 170, 200, 30);
				di_txf.setBounds(160, 210, 200, 30);
				se_txf.setBounds(160, 250, 200, 30);
				ce_txf.setBounds(160, 290, 200, 30);
				vi_txf.setBounds(160, 330, 200, 30);
				user_txf.setBounds(160, 370, 200, 30);
				pass_txf.setBounds(160, 410, 200, 30);
				    //Buttons CRUD
				insert_btn.setBounds(10,490, 85, 30);
				View_btn.setBounds(100,490, 85, 30);
				update_btn.setBounds(190,490, 85, 30);
				delete_tbtn.setBounds(290,490, 85, 30);
				reset_btn.setBounds(390,10, 100,30);
				home_tbtn.setBounds(390,50, 100, 30);
				about_btn.setBounds(390,90, 100, 30);
				setFontforall();
				addcomponentforFrame();
				}
			private void setFontforall() {
				Font font = new Font("Georgia", Font.BOLD, 18);
				id_lb.setFont(font);
				fname_lb.setFont(font);
				lname_lb.setFont(font);
				Email_lb.setFont(font);
				cont_lb.setFont(font);
				di_lb.setFont(font);
				ce_lb.setFont(font);
				se_lb.setFont(font);
				vi_lb.setFont(font);
				user_lb.setFont(font);
				pass_lb.setFont(font);
				
				id_txf.setFont(font);
				fname_txf.setFont(font);
				lname_txf.setFont(font);
				Email_txf.setFont(font);
				cont_txf.setFont(font);
				di_txf.setFont(font);
				se_txf.setFont(font);
				ce_txf.setFont(font);
				vi_txf.setFont(font);
				user_txf.setFont(font);
				pass_txf.setFont(font);
				//Buttons CRUD
				Font fonti = new Font("Courier New", Font.ITALIC, 12);

				insert_btn.setFont(fonti);
				View_btn.setFont(fonti);
				update_btn.setFont(fonti);
				delete_tbtn.setFont(fonti);
				reset_btn.setFont(fonti);
				home_tbtn.setFont(fonti);
				about_btn.setFont(fonti);

			}
			private void addcomponentforFrame() {
				frame.add(id_lb);
				frame.add(fname_lb);
				frame.add(lname_lb);
				frame.add(Email_lb);
				frame.add(cont_lb);
				frame.add(di_lb);
				frame.add(se_lb);
				frame.add(ce_lb);
				frame.add(vi_lb);
				frame.add(user_lb);
				frame.add(pass_lb);
				//text
				frame.add(id_txf);
				frame.add(lname_txf);
				frame.add(fname_txf);
				frame.add(Email_txf);
				frame.add(cont_txf);
				frame.add(di_txf);
				frame.add(se_txf);
				frame.add(ce_txf);
				frame.add(vi_txf);
				frame.add(user_txf);
				frame.add(pass_txf);
				//Buttons CRUD
				frame.add(insert_btn);
				frame.add(delete_tbtn);
				frame.add(View_btn);
				frame.add(update_btn);
				frame.add(reset_btn);
				frame.add(home_tbtn);
				frame.add(about_btn);
				ActionEvent();
			}
				private <insert_btn,View_btn,update_btn, delete_btn> void ActionEvent() {
					insert_btn.addActionListener(this);
					View_btn.addActionListener(this);
					update_btn.addActionListener(this);
					delete_tbtn.addActionListener(this);
					}
			@Override
		   public void actionPerformed(ActionEvent e) {
				Customer cust=new Customer();
				if(e.getSource()==insert_btn) {
					cust.setFname(fname_txf.getText());
					cust.setLname(lname_txf.getText());
					cust.setPhone(cont_txf.getText());
					cust.setCemail(Email_txf.getText());
					cust.setDistrict(di_txf.getText());
					cust.setSector(se_txf.getText());
					cust.setCell(ce_txf.getText());
					cust.setVillage(vi_txf.getText());
					cust.setUsername(user_txf.getText());
					cust.setPassword(pass_txf.getText());
					cust.insertData();
				}else if (e.getSource()==View_btn) {
					int id=Integer.parseInt(id_txf.getText());
					cust.readwithID(id);
					id_txf.setText(String.valueOf(cust.getCid()));
					fname_txf.setText(cust.getFname());
					lname_txf.setText(cust.getLname());
					cont_txf.setText(cust.getPhone());
					Email_txf.setText(cust.getCemail());
					di_txf.setText(cust.getDistrict());
					se_txf.setText(cust.getSector());
					ce_txf.setText(cust.getCell());
					vi_txf.setText(cust.getVillage());
					user_txf.setText(cust.getUsername());
					pass_txf.setText(cust.getPassword());
				 }else if (e.getSource()==update_btn) {
						int id=Integer.parseInt(id_txf.getText());
					ce_txf.setText(cust.getCell());
					cust.setFname(fname_txf.getText());
					cust.setLname(lname_txf.getText());
					cust.setPhone(cont_txf.getText());
					cust.setCemail(Email_txf.getText());
					cust.setDistrict(di_txf.getText());
					cust.setSector(se_txf.getText());
					cust.setCell(ce_txf.getText());
					cust.setVillage(vi_txf.getText());
					cust.setUsername(user_txf.getText());
					cust.setPassword(pass_txf.getText());
					cust.update(id);
				}else {
				int id=Integer.parseInt(id_txf.getText());
				cust.delete(id);
				}
			}
			public static void main(String[] args) {
			CustomerForm customerform= new CustomerForm();
			System.out.println(customerform);
			}}








