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

import entities.Vendor;

public class VendorForm implements ActionListener{ 
	 JFrame frame;
	            JLabel vlnID_lb=new JLabel("Vendor_id");
				JLabel vlname_lb=new JLabel("Last_name");
				JLabel vfname_lb=new JLabel("First name");
				JLabel vemail_lb=new JLabel("vemail");
				JLabel phone_lb=new JLabel("phone");
				JLabel di_lb=new JLabel("District");
				JLabel se_lb=new JLabel("Sector");
				JLabel ce_lb=new JLabel("Cell");
				JLabel vi_lb=new JLabel("Village");
				JLabel user_lb=new JLabel("Username");
				JLabel pass_lb=new JLabel("Password");
			    JTextField id_txf=new JTextField();
				JTextField vlname_txf=new JTextField();
				JTextField vfname_txf=new JTextField();
				JTextField vemail_txf=new JTextField();
				JTextField phone_txf=new JTextField();
				JTextField di_txf=new JTextField();
				JTextField se_txf=new JTextField();
				JTextField ce_txf=new JTextField();
				JTextField vi_txf=new JTextField();
				JTextField user_txf=new JTextField();
				JTextField pass_txf=new JTextField();
				
				//Buttons CRUD
				JButton insert_btn=new JButton("INSERT");
				JButton Read_btn=new JButton("VIEW");
				JButton update_tbtn=new JButton("UPDATE");
				JButton delete_btn=new JButton("DELETE");
				JButton reset_btn=new JButton("RESET");
				JButton home_tbtn=new JButton("HOME");
				JButton about_btn=new JButton("ABOUT US");
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				int w=(int) screensize.getWidth();
				int h=(int) screensize.getHeight();
				 public VendorForm() {
					
					createForm();

				}
				private <insertbtn, delete_btn> void ActionEvent() {
					insert_btn.addActionListener(this);
					Read_btn.addActionListener(this);
					update_tbtn.addActionListener(this);
					delete_btn.addActionListener(this);
				}
				private void createForm() {
					frame=new JFrame();
					frame.setTitle("vendor FORM");
					frame.setBounds(10, 10, 550, 550);
					frame.getContentPane().setLayout(null);
					frame.getContentPane().setBackground(Color.LIGHT_GRAY);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(true);
					setLocationandSize();
				}


				private void setLocationandSize() {
					vlnID_lb.setBounds(10, 10, 120, 30);
					vfname_lb.setBounds(10, 50, 120, 30);
					vlname_lb.setBounds(10, 90, 120, 30);
					vemail_lb.setBounds(10, 130, 100, 30);
					phone_lb.setBounds(10, 170, 100, 30);
					di_lb.setBounds(10, 210, 100, 30);
					se_lb.setBounds(10, 250, 100, 30);
					ce_lb.setBounds(10, 290, 100, 30);
					vi_lb.setBounds(10, 330, 100, 30);
					user_lb.setBounds(10, 370, 100, 30);
					pass_lb.setBounds(10, 410, 100, 30);
					
					id_txf.setBounds(160, 10, 200, 30);
					vfname_txf.setBounds(160, 50, 200, 30);
					vlname_txf.setBounds(160, 90, 200, 30);
					vemail_txf.setBounds(160, 130, 200, 30);
					phone_txf.setBounds(160, 170, 200, 30);
					di_txf.setBounds(160, 210, 200, 30);
					se_txf.setBounds(160, 250, 200, 30);
					ce_txf.setBounds(160, 290, 200, 30);
					vi_txf.setBounds(160, 330, 200, 30);
					user_txf.setBounds(160, 370, 200, 30);
					pass_txf.setBounds(160, 410, 200, 30);
					    //Buttons CRUD
					insert_btn.setBounds(10,450, 85, 30);
					Read_btn.setBounds(100,450, 85, 30);
					update_tbtn.setBounds(190,450, 85, 30);
					delete_btn.setBounds(280,450, 85, 30);
					reset_btn.setBounds(390,10, 100, 30);
					home_tbtn.setBounds(390,50, 100, 30);
					about_btn.setBounds(390,90, 100, 30);
					setFontforall();
					addcomponentforFrame();
					}
				private void setFontforall() {
					Font font = new Font("Georgia", Font.BOLD, 18);

					vlnID_lb.setFont(font);
					vfname_lb.setFont(font);
					vlname_lb.setFont(font);
					vemail_lb.setFont(font);
					phone_lb.setFont(font);
					di_lb.setFont(font);
					ce_lb.setFont(font);
					se_lb.setFont(font);
					vi_lb.setFont(font);
					user_lb.setFont(font);
					pass_lb.setFont(font);

					id_txf.setFont(font);
					vfname_txf.setFont(font);
					vlname_txf.setFont(font);
					vemail_txf.setFont(font);
					phone_txf.setFont(font);
					di_txf.setFont(font);
					se_txf.setFont(font);
					ce_txf.setFont(font);
					vi_txf.setFont(font);
					user_txf.setFont(font);
					pass_txf.setFont(font);
					//Buttons CRUD
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
					frame.add(vlnID_lb);
					frame.add(vfname_lb);
					frame.add(vlname_lb);
					frame.add(vemail_lb);
					frame.add(phone_lb);
					frame.add(di_lb);
					frame.add(se_lb);
					frame.add(ce_lb);
					frame.add(vi_lb);
					frame.add(user_lb);
					frame.add(pass_lb);
					//text
					frame.add(id_txf);
					frame.add(vlname_txf);
					frame.add(vfname_txf);
					frame.add(vemail_txf);
					frame.add(phone_txf);
					frame.add(di_txf);
					frame.add(se_txf);
					frame.add(ce_txf);
					frame.add(vi_txf);
					frame.add(user_txf);
					frame.add(pass_txf);
					//Buttons CRUD
					frame.add(insert_btn);
					frame.add(Read_btn);
					frame.add(update_tbtn);
					frame.add(delete_btn);
					frame.add(reset_btn);
					frame.add(home_tbtn);
					frame.add(about_btn);
					ActionEvent();
				}
				@Override
			   public void actionPerformed(ActionEvent e) {
					Vendor vend=new Vendor();
					if(e.getSource()==insert_btn) {
						vend.setvfname(vfname_txf.getText());
						vend.setvlname(vlname_txf.getText());
						vend.setPhone(phone_txf.getText());
						vend.setvemail(vemail_txf.getText());
						vend.setDistrict(di_txf.getText());
						vend.setSector(se_txf.getText());
						vend.setCell(ce_txf.getText());
						vend.setVillage(vi_txf.getText());
						vend.setUsername(user_txf.getText());
						vend.setPassword(pass_txf.getText());
						
						vend.insertData();
					}else if (e.getSource()==Read_btn) {
						int id=Integer.parseInt(id_txf.getText());
						vend.readwithID(id);
						id_txf.setText(String.valueOf(vend.getvid()));
						vfname_txf.setText(vend.getvfname());
						vlname_txf.setText(vend.getvlname());
						phone_txf.setText(vend.getPhone());
						vemail_txf.setText(vend.getvemail());
						di_txf.setText(vend.getDistrict());
						se_txf.setText(vend.getSector());
						ce_txf.setText(vend.getCell());
						vi_txf.setText(vend.getVillage());
						user_txf.setText(vend.getUsername());
						pass_txf.setText(vend.getPassword());
						
						ce_txf.setText(vend.getCell());
					    }else if (e.getSource()==update_tbtn) {
						int id=Integer.parseInt(id_txf.getText());
						vend.setvfname(vfname_txf.getText());
						vend.setvlname(vlname_txf.getText());
						vend.setPhone(phone_txf.getText());
						vend.setvemail(vemail_txf.getText());
						vend.setDistrict(di_txf.getText());
						vend.setSector(se_txf.getText());
						vend.setCell(ce_txf.getText());
						vend.setVillage(vi_txf.getText());
						vend.setUsername(user_txf.getText());
						vend.setPassword(pass_txf.getText());
						vend.update(id);
						}else {
						int id=Integer.parseInt(id_txf.getText());
						vend.delete(id);}
					}
				public static void main(String[] args) {
				VendorForm vendorForm= new VendorForm();
				System.out.println(vendorForm);
				}}

