package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Vendor {
		private int vid;
		private String vfname;
		private String vlname;
		private String phone;
		private String vemail;
		private String district;
		private String sector;
		private String cell;
		private String village;
		private String username;
		private String password;
		public Vendor() {}
		public Vendor(int vid, String vfname , String vlname, String phone, String vemail ,
				String district ,String sector,String cell,String village,int match_id,String username,String password) {
			super();
			this. vid =  vid;
			this.vfname = vfname;
			this.vlname = vlname;
			this.phone = phone;
			this.vemail = vemail;
			this.district=district;
			this.sector=sector;
			this.cell=cell;
			this.village=village;
			this.username=username;
			this.password=password;
		}
		
		public Vendor( String vlname, String vfname, String phone, String email,String district,String sector,String cell,String village,String username,String password) {
			this.vfname = vfname;
			this.vlname = vlname;
			this.phone = phone;
			this.vemail= email;
			this.district=district;
			this.sector=sector;
			this.cell=cell;
			this.village=village;
			this.username=username;
			this.password=password;
		}

		public int getvid() {
			return vid;
		}
		public void setvid(int vid) {
			this.vid = vid;
		}
		public String getvfname() {
			return vfname;
		}
		public void setvfname(String vfname) {
			this.vfname = vfname;
		}
		public String getvlname() {
			return vlname;
		}
		public void setvlname(String vlname) {
			this.vlname = vlname;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getvemail() {
			return vemail;
		}
		public void setvemail(String vemail) {
			this.vemail = vemail;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
		public String getCell() {
			return cell;
		}
		public void setCell(String cell) {
			this.cell = cell;
		}
		public String getVillage() {
			return village;
		}
		public void setVillage(String village) {
			this.village = village;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public void makeconnection() {
		}
				public void insertData() {
			// JDBC URL, username, and password of MySQL server
		    String host = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to insert data
		    String sql = "INSERT INTO vendor (vfname,vlname,phone,vemail,district,sector,cell,village,username,password) VALUES (?,?,?,?,?,?,?,?,?,?)";
			
		    try (
		        // Establish the connection
		        Connection con = DriverManager.getConnection(host, user, password);

		        // Create a prepared statement
		    		   PreparedStatement preparedStatement = con.prepareStatement(sql);
		    	    ) {
		        // Set the values for the prepared statement
		       preparedStatement.setString(1, this.vfname);
		        preparedStatement.setString(2, this.vlname);
		        preparedStatement.setString(3, this.phone);
		        preparedStatement.setString(4, this.vemail);
		        preparedStatement.setString(5, this.district);
		        preparedStatement.setString(6, this.sector);
		        preparedStatement.setString(7,this.cell);
		        preparedStatement.setString(8,this.village);
		        preparedStatement.setString(9,this.username);
		        preparedStatement.setString(10,this.password);
		        // Execute the query
		        int rowsAffected = preparedStatement.executeUpdate();

		        // Check the result
		        if (rowsAffected > 0) {
		        	System.out.println("Registration  successfully!");
		            JOptionPane.showMessageDialog(null, "Data registered successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            System.out.println("Failed to insert data.");
		            JOptionPane.showMessageDialog(null, "Failed to register data.!","After insert",JOptionPane.ERROR_MESSAGE);

		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }	
		}
		 
		public void readwithID(int inputid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to select all columns from student where id = ?
		    String sql = "SELECT * FROM vendor WHERE vid = ?";

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
		        	this.setvid(resultSet.getInt("vid"));
		           this.setvfname(resultSet.getString("vfname"));
		           this.setvlname(resultSet.getString("vlname"));
		           this.setPhone(resultSet.getString("phone"));
		            this.setvemail(resultSet.getString("vemail"));
		            this.setDistrict(resultSet.getString("district"));
		            this.setSector(resultSet.getString("sector"));
		            this.setCell(resultSet.getString("cell"));
		            this.setVillage(resultSet.getString("village"));
		            this.setUsername(resultSet.getString("username"));
		            this.setPassword(resultSet.getString("password"));
		            }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		
		public void update(int inputvendorid) {
			// JDBC URL, username, and password of MySQL server
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to update data
		    String sql = "UPDATE vendor SET  vfname= ?, vlname = ?,phone = ?, vemail = ?, district=?,sector=?,cell=?,village=?,username=?,password=? WHERE vid = ?";

		    try (
		        // Establish the co
		        Connection co = DriverManager.getConnection(url, user, password);

		        // Create a prepared statement
		        PreparedStatement adm = co.prepareStatement(sql);
		    ) {
		        // Set the new values for the update
		    	  adm.setString(1, this.getvfname());
		        adm.setString(2, this.getvlname());
		       adm.setString(3, this.getPhone()); // Assuming there is a column named 'id' for the WHERE clause
		        adm.setString(4, this.getvemail());
		        adm.setString(5, this.getDistrict());
		        adm.setString(6, this.getSector());
		        adm.setString(7, this.getCell());
		        adm.setString(8, this.getVillage());
		        adm.setString(9, this.getUsername());
		        adm.setString(10, this.getPassword());
		        adm.setInt(11, inputvendorid);
		       
		        // Execute the update
		        int rowsAffected = adm.executeUpdate();

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
		    String url = "jdbc:mysql://localhost/nsengimana_eric_pdas";
		    String user = "222007448";
		    String password = "222007448";

		    // SQL query to delete data
		    String sql = "DELETE FROM vendor WHERE vid = ?";

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
