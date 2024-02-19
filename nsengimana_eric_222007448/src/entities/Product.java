package entities;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class Product {
		private int  pid;
		private String pname;
		private String pgrade;
		private String  price_per_unit;
		private String mfd_date;
		private String exp_date;
		public Product() {}
		public Product(int  pid, String pname , String pgrade, String  price_per_unit,String mfd_date, String exp_date) {
			this.  pid =   pid;
			this.pname = pname;
			this.pgrade = pgrade;
			this.mfd_date = mfd_date;
			this.exp_date = exp_date;
			this. price_per_unit= price_per_unit;
	
			}
		public Product( String pname, String pgrade,String  price_per_unit,String mfd_date, String exp_date) {
			this.pname = pname;
			this.pgrade = pgrade;
			this.mfd_date = mfd_date;
			this.exp_date= exp_date;
			this. price_per_unit= price_per_unit;
			
		}

		
		public int getpid() {
			return  pid;
		}
		public void setpid(int  pid) {
			this. pid =  pid;
		}
		public String getpname() {
			return pname;
		}
		public void setpname(String pname) {
			this.pname = pname;
		}
		public String getpgrade() {
			return pgrade;
		}
		public void setpgrade(String pgrade) {
			this.pgrade = pgrade;
		}
		public String getprice_per_unit() {
			return price_per_unit;
		}
		public void setprice_per_unit(String price_per_unit) {
			this.price_per_unit = price_per_unit;
		}
		public String getmfd_date() {
			return mfd_date;
		}
		public void setmfd_date(String mfd_date) {
			this.mfd_date = mfd_date;
		}
		public String getexp_date() {
			return exp_date;
		}
		public void setexp_date(String exp_date) {
			this.exp_date = exp_date;
		}
		
		public void makeconnection() {
		}
		public void insertData(String p_n,String p_g, String price,String ex,String mf) {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO product (pname,pgrade,price_per_unit,mfd_date,exp_date) VALUES (?, ?,?, ?, ?)";
		
		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
					   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1, p_n);
		        preparedStatement.setString(2, p_g);
		        preparedStatement.setString(3, price);
		        preparedStatement.setString(4, mf);
		        preparedStatement.setString(5, ex);
		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("Data inserted successfully!");
		            JOptionPane.showMessageDialog(null, "Data inserted successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to insert data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }	
		}
		public void insertData() {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO product(pname,pgrade, price_per_unit,mfd_date,exp_date) VALUES (?, ?, ?,?,?)";

		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
		    		   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1, this.pname);
		        preparedStatement.setString(2, this.pgrade);
		        preparedStatement.setString(3, this.price_per_unit);
		        preparedStatement.setString(4, this.mfd_date);
		        preparedStatement.setString(5, this.exp_date);
		      
		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("Data inserted successfully!");
		            JOptionPane.showMessageDialog(null, "Data inserted successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to insert data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }	
		}

		public void readwithID(int inputid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to select all columns from Product where id = ?
		    String sql = "SELECT * FROM product WHERE pid  = ?";

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
		        	this.setpid(resultSet.getInt("pid"));
		           this.setpname(resultSet.getString("pname"));
		           this.setpgrade(resultSet.getString("pgrade"));
		           this.setmfd_date(resultSet.getString("mfd_date"));
		            this.setexp_date(resultSet.getString("exp_date"));
		            this.setprice_per_unit(resultSet.getString("price_per_unit"));
		           
		           }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		public void update(int inputpid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to update data
		    String sql = "UPDATE product SET  pname= ?, pgrade = ?,mfd_date = ?, exp_date = ?,  price_per_unit=? WHERE  pid  = ?";

		    try (
		        // Establish the co
		        Connection co = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement preparedstatement = co.prepareStatement(sql);
		    ) {
		        // Set the new values for the update
		    	  preparedstatement.setString(1, this.pname);
		        preparedstatement.setString(2, this.pgrade);
		        preparedstatement.setObject(3, this.price_per_unit);
		       preparedstatement.setString(4, this.mfd_date); 
		        preparedstatement.setString(5, this.exp_date);
		      preparedstatement.setInt(6, inputpid);
		       
		        // Execute the update
		        int rowsAffected = preparedstatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		            System.out.println("Data updated successfully!");
		        } else {
		            System.out.println("Failed to update data. No matching record found.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }   
		}
		public void delete(int inputid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to delete data
		    String sql = "DELETE FROM product WHERE  pid = ?";

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




