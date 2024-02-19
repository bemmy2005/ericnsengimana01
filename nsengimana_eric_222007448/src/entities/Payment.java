package entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Payment {
		private int  payid;
		private String paydate;
		private String pamount;
		private String pmethod;
		private String orid;
		private String pay_status;
		private String cid;
		private String phone;
		
		public Payment() {}
		public Payment(int  payid, String  paydate , String pamount, String pmethod, String orid ,
				String pay_status ,String cid,String phone) {
			super();
			this.  payid =   payid;
			this. paydate =  paydate;
			this.pamount = pamount;
			this.pmethod = pmethod;
			this.orid = orid;
			this.pay_status=pay_status;
			this.cid=cid;
			this.phone=phone;
		
		}
		
		public Payment( String pamount, String  paydate, String pmethod, String email,String pay_status,String cid,String phone) {
			this. paydate =  paydate;
			this.pamount = pamount;
			this.pmethod = pmethod;
			this.orid= email;
			this.pay_status=pay_status;
			this.cid=cid;
			this.phone=phone;
		}

		public int getpayid() {
			return  payid;
		}
		public void setpayid(int  payid) {
			this. payid =  payid;
		}
		public String getpaydate() {
			return  paydate;
		}
		public void setpaydate(String  paydate) {
			this. paydate =  paydate;
		}
		public String getpamount() {
			return pamount;
		}
		public void setpamount(String pamount) {
			this.pamount = pamount;
		}
		public String getpmethod() {
			return pmethod;
		}
		public void setpmethod(String pmethod) {
			this.pmethod = pmethod;
		}
		public String getorid() {
			return orid;
		}
		public void setorid(String orid) {
			this.orid = orid;
		}
		public String getpay_status() {
			return pay_status;
		}
		public void setpay_status(String pay_status) {
			this.pay_status = pay_status;
		}
		public String getcid() {
			return cid;
		}
		public void setcid(String cid) {
			this.cid = cid;
		}
		public String getphone() {
			return phone;
		}
		public void setphone(String phone) {
			this.phone =phone;
		}
		public void makeconnection() {
		}
		public void insertData(String pay_d,String pa_am, String pa_me,String or_id,String pay_sta,String c_id,String ph_n) {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO Payment ( paydate,pamount,pmethod,orid,pay_status,cid,phone) VALUES (?, ?,?, ?, ?,?,?)";
		
		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
					   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1, pay_d);
		        preparedStatement.setString(2, pa_am );
		        preparedStatement.setString(3,pa_me );
		        preparedStatement.setString(4,or_id );
		        preparedStatement.setString(5, pay_sta);
		        preparedStatement.setString(6, c_id);
		        preparedStatement.setString(7, ph_n);
		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("YOU HAVE PAID successfully!");
		            JOptionPane.showMessageDialog(null, "Data inserted successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to insert data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }}	

		public void insertData() {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO Payment ( paydate,pamount,pmethod,orid,pay_status,cid,phone) VALUES (?, ?,?, ?, ?,?,?)";
		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
		    		   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1, this. paydate);
		        preparedStatement.setString(2, this.pamount);
		        preparedStatement.setString(3, this.pmethod);
		        preparedStatement.setString(4, this.orid);
		        preparedStatement.setString(5, this.pay_status);
		        preparedStatement.setString(6, this.cid);
		        preparedStatement.setString(7,this.phone);
		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("YOU HAVE PAID  successfully!");
		            JOptionPane.showMessageDialog(null, "YOU HAVE PAID successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to register data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }	
		}
		 
		public void readWithID(int inputid) {
		    // JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to select all columns from payment where payid = ?
		    String sql = "SELECT * FROM Payment WHERE  payid = ?";

		    try (
		        // Establish the connection
		        Connection connection = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement preparedStatement = connection.prepareStatement(sql);
		    ) {
		        // Set the value for the parameterized query
		        preparedStatement.setInt(1, inputid);

		        // Execute the query and get the result set
		        try (ResultSet resultSet = preparedStatement.executeQuery()) {
		            // Process the result set
		            while (resultSet.next()) {
		                this.setpayid(resultSet.getInt("payid"));
		                this.setpaydate(resultSet.getString("paydate"));
		                this.setpamount(resultSet.getString("pamount"));
		                this.setpmethod(resultSet.getString("pmethod"));
		                this.setorid(resultSet.getString("orid"));
		                this.setpay_status(resultSet.getString("pay_status"));
		                this.setcid(resultSet.getString("cid"));
		                this.setphone(resultSet.getString("phone"));
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

		
		public void update(int inputPaymentid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to update data
		    String sql = "UPDATE Payment SET   paydate= ?, pamount = ?,pmethod = ?, orid = ?, pay_status=?,cid=?,phone=? WHERE  payid = ?";

		    try (
		        // Establish the co
		        Connection co = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement pay = co.prepareStatement(sql);
		    ) {
		        // Set the new values for the update
		    	  pay.setString(1, this.getpaydate());
		        pay.setString(2, this.getpamount());
		       pay.setString(3, this.getpmethod()); // Assuming there is a column named 'id' for the WHERE clause
		        pay.setString(4, this.getorid());
		        pay.setString(5, this.getpay_status());
		        pay.setString(6, this.getcid());
		        pay.setString(7, this.getphone());
		        pay.setInt(8, inputPaymentid);
		       
		        // Execute the update
		        int rowsAffected = pay.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		            System.out.println("YOU HAVE PAID successfully!");
		        } else {
		            System.out.println("Failed to update data. No matching record found.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }   
		}
		public void delete(int inputid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to delete data
		    String sql = "DELETE FROM Payment WHERE  payid = ?";

		    try (
		        // Establish the 
		        Connection co = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement pl = co.prepareStatement(sql);
		    ) {
		        // Set the value for the WHERE clause
		        pl.setInt(1, inputid); // Assuming there is a column named 'id' for the WHERE clause

		        // Execute the delete
		        int rowsAffected = pl.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		            System.out.println("Data deleted successfully!");
		        } else {
		            System.out.println("Failed to delete data. No matching record found.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		}




