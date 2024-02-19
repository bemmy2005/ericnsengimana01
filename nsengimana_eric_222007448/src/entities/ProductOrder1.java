package entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ProductOrder1 {
		private int  orid;
		private String ordate;
		private String  pid;
		private String pquantity;
		private String orprice;
		private String cid;
		private String order_status;
		public ProductOrder1() {}
		public ProductOrder1(int  orid, String ordate , String pid, String pquantity, String orprice ,
				String cid  ,String order_status) {
			super();
			this.  orid =   orid;
			this.ordate = ordate;
			this. pid =  pid;
			this.pquantity = pquantity;
			this.orprice = orprice;
			this.cid=cid;
			this.order_status=order_status;
		}
		
		public ProductOrder1( String ordate , String pid, String pquantity, String orprice ,
				String cid ,String Orprice ,String order_status) {
			this.ordate = ordate;
			this. pid =  pid;
			this.pquantity = pquantity;
			this.orprice= orprice;
			this.cid=cid;
			this.order_status=order_status;
		}

		public int getOrid() {
			return orid;
		}
		public void setOrid(int orid) {
			this.orid = orid;
		}
		public String getOrdate() {
			return ordate;
		}
		public void setOrdate(String ordate) {
			this.ordate = ordate;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public String getPquantity() {
			return pquantity;
		}
		public void setPquantity(String pquantity) {
			this.pquantity = pquantity;
		}
		public String getorprice() {
			return orprice;
		}
		public void setorprice(String orprice) {
			this.orprice = orprice;
		}
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getOrder_status() {
			return order_status;
		}
		public void setOrder_status(String order_status) {
			this.order_status = order_status;
		}
		public void makeconnection() {
		}
		public void insertData() {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO Product_order (ordate, pid,pquantity,orprice,cid,order_status) VALUES (?, ?,?, ?, ?,?)";
		
		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
					   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1,this.ordate);
		        preparedStatement.setString(2,this.pid);
		        preparedStatement.setString(3, this.pquantity);
		        preparedStatement.setString(4, this.orprice);
		        preparedStatement.setString(5, this.cid);
		        preparedStatement.setString(6, this.order_status);
		        		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("GOODS ORDERED successfully!");
		            JOptionPane.showMessageDialog(null, "GOODS ORDERED successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to insert data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }}	

	  
	
public void readwithID(int inputid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to select all columns from student where id = ?
		    String sql = "SELECT * FROM Product_order WHERE  orid= ?";

		    try (
		        // Establish the connection
		        Connection connection = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement preparedStatement = connection.prepareStatement(sql);
		    ) {
		        // Set the value for the parameterized query
		        //int studentId = 1; // Replace with the desired student id
		        //if()
		    	preparedStatement.setInt(1, inputid);

		        // Execute the query and get the result set
		        ResultSet resultSet = preparedStatement.executeQuery();

		        // Process the result set
		        while (resultSet.next()) {
		        	this.setOrid(resultSet.getInt("orid"));
		           this.setOrdate(resultSet.getString("ordate"));
		           this.setPid(resultSet.getString("pid"));
		           this.setPquantity(resultSet.getString("pquantity"));
		            this.setorprice(resultSet.getString("orprice"));
		            this.setCid(resultSet.getString("cid"));
		            this.setOrder_status(resultSet.getString("order_status"));
		            }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		
		public void update(int inputProduct_orderid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to update data
		    String sql = "UPDATE Product_order SET  ordate= ?,  pid = ?,pquantity = ?, orprice = ?, cid=?,order_status=?WHERE  orid = ?";

		    try (
		        // Establish the co
		        Connection co = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement Produ_or= co.prepareStatement(sql);
		    ) {
		        // Set the new values for the update
		    	  Produ_or.setString(1, this.ordate);
		    	  Produ_or.setString(2, this.pid);
		    	  Produ_or.setString(3, this.pquantity); // Assuming there is a column named 'id' for the WHERE clause
		    	  Produ_or.setString(4, this.orprice);
		    	  Produ_or.setString(5, this.cid);
		    	  Produ_or.setString(6, this.order_status);
		    	  Produ_or.setInt(7, inputProduct_orderid);
		     
		        // Execute the update
		        int rowsAffected = Produ_or.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		            System.out.println("GOOD ORDERED successfully!");
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
		    String sql = "DELETE FROM Product_order WHERE  orid = ?";

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
		            System.out.println("GOODS order deleted successfully!");
		        } else {
		            System.out.println("Failed to delete data. No matching record found.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		}
