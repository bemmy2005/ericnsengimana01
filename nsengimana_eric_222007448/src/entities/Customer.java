package entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Customer {
    private int cid;
    private String fname;
    private String lname;
    private String phone;
    private String cemail;
    private String district;
    private String sector;
    private String cell;
    private String village;
    private String username;
    private String Password;

    public Customer() {}

    // Constructor with all fields
    public Customer(int cid, String fname, String lname, String phone, String cemail,
                    String district, String sector, String cell, String village,
                    String username, String password) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.cemail = cemail;
        this.district = district;
        this.sector = sector;
        this.cell = cell;
        this.village = village;
        this.username = username;
        this.Password = password;
    }

    // Constructor without cid
    public Customer(String fname, String lname, String phone, String cemail,
                    String district, String sector, String cell, String village,
                    String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.cemail = cemail;
        this.district = district;
        this.sector = sector;
        this.cell = cell;
        this.village = village;
        this.username = username;
        this.Password = password;
    }

    // Getters and setters
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
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
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
	public void makeconnection() {
	} 
	// Method to insert customer data
			
		// JDBC URL, username, and password of MySQL server
				private Connection  getConnction() throws SQLException {
		String host = "jdbc:mysql://localhost/nsengimana_eric_pdas";
	    String user = "222007448";
	    String password = "222007448";
	    return DriverManager.getConnection(host,user,password);
}
	    		public void insertData() {
        String sql = "INSERT INTO customer (fname, lname, phone, cemail, district, sector, cell, village, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = getConnction();
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {
   
            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, cemail);
            preparedStatement.setString(5, district);
            preparedStatement.setString(6, sector);
            preparedStatement.setString(7, cell);
            preparedStatement.setString(8, village);
            preparedStatement.setString(9, username);
            preparedStatement.setString(10, Password);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Registration successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
			public void readwithID(int inputid) {
   
		    String sql = "SELECT * FROM customer WHERE cid = ?";

		    try (
		        Connection connection=getConnction();

		        // Create a prepared statement
		        PreparedStatement preparedStatement = connection.prepareStatement(sql);
		    ) {
		        // Set the value for the parameterized query
		        //int customerId = 1; // Replace with the desired student id
		        //if()
		    	preparedStatement.setInt(1, inputid);

		        // Execute the query and get the result set
		        ResultSet resultSet = preparedStatement.executeQuery();

		        // Process the result set
		        if (resultSet.next()) {
                		this.setCid(resultSet.getInt("cid"));
                		this.setFname(resultSet.getString("fname"));
                		this.setLname(resultSet.getString("lname"));
                		this.setPhone(resultSet.getString("phone"));
                		this.setCemail(resultSet.getString("cemail"));
                		this.setDistrict(resultSet.getString("district"));
                		this.setSector(resultSet.getString("sector"));
                		this.setCell(resultSet.getString("cell"));
                		this.setVillage(resultSet.getString("village"));
                		this.setUsername(resultSet.getString("username"));
                		this.setPassword(resultSet.getString("password"));
		        
                
	            }else {
							JOptionPane.showMessageDialog(null, "no data  costumer found:"+ inputid, "read Error", JOptionPane.ERROR_MESSAGE);
						}

			    } catch (SQLException e) {
			        JOptionPane.showMessageDialog(null,"Failed to read data:" + e.getMessage(),"Read Error",JOptionPane.ERROR_MESSAGE);
			    }
			}

    // Method to update customer data

			public void update(int inputadminid) {
				

			    // SQL query to update data
			    String sql = "UPDATE customer SET  fname= ?, lname = ?,phone = ?,cemail = ?, district=?, sector=?, cell=?, village=?, username=?, password=? WHERE cid = ?";

			    try ( Connection connection=getConnction();

			        // Create a prepared statement
			        PreparedStatement cust = connection.prepareStatement(sql);
			    ) {
			        // Set the new values for the update
			    	  cust.setString(1, this.fname);
			        cust.setString(2, this.lname);
			       cust.setString(3, this.phone); 
			        cust.setString(4, this.cemail);
			        cust.setString(5, this.district); 
			        cust.setString(6, this.sector);
			        cust.setString(7, this.cell); 
			        cust.setString(8, this.village);
			        cust.setString(9, this.username);
			        cust.setString(10, this.Password);
			        cust.setInt(11, inputadminid);
			       
			        // Execute the update
			        int rowsAffected = cust.executeUpdate();

			        // Check the result
			        if (rowsAffected > 0) {
			            System.out.println("Data updated successfully!");
			        } else {
			            System.out.println("Failed to update data. No matching record found.");
			        }

			    } catch (SQLException e) {
			    	JOptionPane.showMessageDialog(null,"Failed to update data:" + e.getMessage(),"Update Error",JOptionPane.ERROR_MESSAGE);
			    }   
			}

    // Method to delete customer data
    public  void delete(int customerId) {
  
        String sql="DELETE FROM customer where cid=?";
		try ( Connection connection=getConnction();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, customerId);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Failed to delete data. No matching record found.");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Failed to delete data:" + e.getMessage(),"Update Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
