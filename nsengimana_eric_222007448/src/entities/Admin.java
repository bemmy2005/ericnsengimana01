package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Admin {
    private int admid;
    private String fname;
    private String lname;
    private String phone;
    private String cemail;
    private String username;
    private String password;

    public Admin() {}

    public Admin(int admid, String fname, String lname, String phone, String cemail,
                 String username, String password) {
        this.admid = admid;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.cemail = cemail;
        this.username = username;
        this.password = password;
    }

    // Constructor with additional parameters for registration
    public Admin(String fname, String lname, String phone, String cemail,
                 String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.cemail = cemail;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public int getAdmid() {
        return admid;
    }

    public void setAdmid(int admid) {
        this.admid = admid;
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

    // Method to establish database connection
    private Connection makeConnection() throws SQLException {
        String host = "jdbc:mysql://localhost/ nsengimana_eric_pdas";
        String user = "222007448";
        String password = "222007448";
        return DriverManager.getConnection(host, user, password);
    }
    // Method to insert admin data into the database
    public void insertData() {
        String sql = "INSERT INTO admin (fname, lname, phone, email, username, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = makeConnection();
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            preparedStatement.setString(1, this.fname);
            preparedStatement.setString(2, this.lname);
            preparedStatement.setString(3, this.phone);
            preparedStatement.setString(4, this.cemail);
            preparedStatement.setString(5, this.username);
            preparedStatement.setString(6, this.password);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Registration successful!");
                JOptionPane.showMessageDialog(null, "Admin signup successful!", "After insert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed to insert data.");
                JOptionPane.showMessageDialog(null, "Failed to register data!", "After insert", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method for admin login
    public void login() {
        String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";

        try (Connection con = makeConnection();
             PreparedStatement stm = con.prepareStatement(sql)) {

            stm.setString(1, this.cemail);
            stm.setString(2, this.password);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                //System.out.println("Login successful!");
                //JOptionPane.showMessageDialog(null, "Login successful!", "After login", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Incorrect Email and password!");
                JOptionPane.showMessageDialog(null, "Incorrect Email and password!", "After login", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
