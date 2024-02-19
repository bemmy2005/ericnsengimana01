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
import entities.Product;
public class ProductsForm implements ActionListener{ 
	                  JFrame frame;
				JLabel pid_lb=new JLabel(" pid");
				JLabel pname_lb=new JLabel("pname");
				JLabel pgrade_lb=new JLabel(" pgrade");
				JLabel price_per_unit_lb=new JLabel(" price_per_unit");
				JLabel mfd_date_lb=new JLabel("mfd_date");
				JLabel exp_date_lb=new JLabel("exp_date");
		         
		          //text
			    JTextField pid_txf=new JTextField();
				JTextField pname_txf=new JTextField();
				JTextField pgrade_txf=new JTextField();
				JTextField price_per_unit_txf=new JTextField();
				JTextField mfd_date_txf=new JTextField();
				JTextField exp_date_txf=new JTextField();
		
			 //Buttons CRUD
				JButton insert_btn=new JButton("Insert");
				JButton Read_btn=new JButton("View");
				JButton update_tbtn=new JButton("Update");
				JButton delete_btn=new JButton("Delete");
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				int w=(int) screensize.getWidth();
				int h=(int) screensize.getHeight();
				public ProductsForm() {
					createForm();
					}
				private  <insertbtn, delete_btn> void ActionEvent() {
					insert_btn.addActionListener(this);
					Read_btn.addActionListener(this);
					update_tbtn.addActionListener(this);
					delete_btn.addActionListener(this);
				}
				private  void createForm() {
					frame=new JFrame();
					frame.setTitle("PRODUCT FORM");
					frame.setBounds(10, 10, 500, 400);
					frame.getContentPane().setLayout(null);
					frame.getContentPane().setBackground(Color.LIGHT_GRAY);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(true);
					setLocationandSize();
				}


				private void setLocationandSize() {
					pid_lb.setBounds(10, 10, 100, 30);
					pname_lb.setBounds(10, 50, 100, 30);
					pgrade_lb.setBounds(10, 90, 100, 30);
					price_per_unit_lb.setBounds(10, 130, 100, 30);
					mfd_date_lb.setBounds(10, 170, 100, 30);
					exp_date_lb.setBounds(10, 210, 100, 30);
				   
				   pid_txf.setBounds(160, 10, 130, 30);
					pname_txf.setBounds(160, 50, 130, 30);
					pgrade_txf.setBounds(160, 90, 130, 30);
					 price_per_unit_txf.setBounds(160, 130, 130, 30);
					mfd_date_txf.setBounds(160, 170, 130, 30);
					exp_date_txf.setBounds(160, 210, 130, 30);
					
					 //Buttons CRUD
					insert_btn.setBounds(10,250, 85, 30);
					Read_btn.setBounds(100,250, 85, 30);
					update_tbtn.setBounds(190,250, 85, 30);
					delete_btn.setBounds(280,250, 85, 30);
					setFontforall();
					addcomponentforFrame();
					}
				private void setFontforall() {
					Font font = new Font("Georgia", Font.BOLD, 18);

					pid_lb.setFont(font);
					pname_lb.setFont(font);
					pgrade_lb.setFont(font);
					mfd_date_lb.setFont(font);
					exp_date_lb.setFont(font);
					price_per_unit_lb.setFont(font);
					
					//text
	                 pid_txf.setFont(font);
					pname_txf.setFont(font);
					pgrade_txf.setFont(font);
					mfd_date_txf.setFont(font);
					exp_date_txf.setFont(font);
					 price_per_unit_txf.setFont(font);
					
					//Buttons CRUD
					Font fonti = new Font("Courier New", Font.ITALIC, 12);

					insert_btn.setFont(fonti);
					Read_btn.setFont(fonti);
					update_tbtn.setFont(fonti);
					delete_btn.setFont(fonti);

				}
				private void addcomponentforFrame() {
					frame.add(pid_lb);
					frame.add(pname_lb);
					frame.add(pgrade_lb);
					frame.add(mfd_date_lb);
					frame.add(exp_date_lb);
					frame.add(price_per_unit_lb);
				
				//text
					frame.add(pid_txf);
					frame.add(pname_txf);
					frame.add(pgrade_txf);
					frame.add(mfd_date_txf);
					frame.add(exp_date_txf);
					frame.add( price_per_unit_txf);
					
					//Buttons CRUD
					frame.add(insert_btn);
					frame.add(Read_btn);
					frame.add(update_tbtn);
					frame.add(delete_btn);
					ActionEvent();
				}
				@Override
			   public void actionPerformed(ActionEvent e) {
					Product product=new Product();
					if(e.getSource()==insert_btn) {
						product.setpname(pname_txf.getText());
						product.setpgrade(pgrade_txf.getText());
						product.setmfd_date(mfd_date_txf.getText());
						product.setexp_date(exp_date_txf.getText());
						product.setprice_per_unit(price_per_unit_txf.getText());
						
						product.insertData();
					}else if (e.getSource()==Read_btn) {
						int pid=Integer.parseInt(pid_txf.getText());
						product.readwithID(pid);
						pid_txf.setText(String.valueOf(product.getpid()));
						pname_txf.setText(product.getpname());
						pgrade_txf.setText(product.getpgrade());
						price_per_unit_txf.setText(product.getprice_per_unit());
						mfd_date_txf.setText(product.getmfd_date());
						exp_date_txf.setText(product.getexp_date());
						
						
					    }else if (e.getSource()==update_tbtn) {
						int pid=Integer.parseInt(pid_txf.getText());
						product.setpname(pname_txf.getText());
						product.setpgrade(pgrade_txf.getText());
						product.setmfd_date(mfd_date_txf.getText());
						product.setexp_date(exp_date_txf.getText());
						product.setprice_per_unit(price_per_unit_txf.getText());
						product.update(pid);
						int pid1=Integer.parseInt(pid_txf.getText());
						product.delete(pid1);
					}}
				public static void main(String[] args) {
				ProductsForm productForm= new ProductsForm();
				System.out.println(productForm);
				}}


