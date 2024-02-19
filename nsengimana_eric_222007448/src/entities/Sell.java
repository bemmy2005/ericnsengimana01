package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Sell {
	  
    private int sid;
    private String ordate;
    private String vid;
    private String orid;
    private String productName;
    private String admid;

    public Sell() {}

    public Sell(int sid, String ordate, String vid, String orid, String productName, String admid) {
        this.sid = sid;
        this.ordate = ordate;
        this.vid = vid;
        this.orid = orid;
        this.productName = productName;
        this.admid = admid;
    }

    public Sell(String ordate, String vid, String orid, String productName, String admid) {
        this.ordate = ordate;
        this.vid = vid;
        this.orid = orid;
        this.productName = productName;
        this.admid = admid;
    }

    // Getters and setters
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getOrdate() {
        return ordate;
    }

    public void setOrdate(String ordate) {
        this.ordate = ordate;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAdmid() {
        return admid;
    }

    public void setAdmid(String admid) {
        this.admid = admid;
    }

    public String getOrid() {
        return orid;
    }
    

    public void setOrid(String orid) {
		this.orid = orid;
	}

	// Establish database connection
    private Connection getConnection() throws SQLException {
        String host = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
        String user = "222007448";
        String password = "222007448";
        return DriverManager.getConnection(host, user, password);
    }

    // Insert data into the database
    public void insertData() {
        String sql = "INSERT INTO Sell (sdate, vid, orid, product_name, admid) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            preparedStatement.setString(1, this.ordate);
            preparedStatement.setString(2, this.vid);
            preparedStatement.setString(3, this.orid);
            preparedStatement.setString(4, this.productName);
            preparedStatement.setString(5, this.admid);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("YOU HAVE SOLD successfully!");
                JOptionPane.showMessageDialog(null, " YOU HAVE SOLD successfully!", "After insert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed to insert data.");
                JOptionPane.showMessageDialog(null, "Failed to insert data!", "After insert", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read data from the database based on ID
    public void readWithID(int inputid) {
        String sql = "SELECT * FROM Sell WHERE sid = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, inputid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                this.setSid(resultSet.getInt("sid"));
                this.setOrdate(resultSet.getString("sdate"));
                this.setVid(resultSet.getString("vid"));
                this.setOrid(resultSet.getString("orid"));
                this.setProductName(resultSet.getString("product_name"));
                this.setAdmid(resultSet.getString("admid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update data in the database
    public void update(int inputid) {
        String sql = "UPDATE sell SET sdate=?, vid=?, orid=?, product_name=?, admid=? WHERE sid=?";


	    try ( Connection connection=getConnection();

	        // Create a prepared statement
	        PreparedStatement cust = connection.prepareStatement(sql);
	    ) {
	        // Set the new values for the update
	    	  cust.setString(1, this.ordate);
	        cust.setString(2, this.vid);
	       cust.setString(3, this.orid); 
	        cust.setString(4, this.productName);
	        cust.setString(5, this.admid); 
	        cust.setInt(6, inputid);
	        int rowsAffected = cust.executeUpdate();

	        // Check the result
	        if (rowsAffected > 0) {
	            System.out.println("YOU have updated successfully!");
	        } else {
	            System.out.println("Failed to update data. No matching record found.");
	        }

	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null,"Failed to update data:" + e.getMessage(),"Update Error",JOptionPane.ERROR_MESSAGE);
	    }   
	}
    // Delete data from the database based on ID
    public void delete(int inputid) {
        String sql = "DELETE FROM Sell WHERE sid = ?";
        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setInt(1, inputid);
            int rowsAffected = preparedStatement.executeUpdate();
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