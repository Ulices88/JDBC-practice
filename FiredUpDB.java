

import java.sql.*;
import java.util.ArrayList;

public class FiredUpDB {
    private static final String FIREDUP_URL = "jdbc:jtds:sqlserver://cisdbss.pcc.edu/FiredUp";
    private static final String USERNAME = "275student";
    private static final String PASSWORD = "275student";
    private static final String CUSTOMERS_SQL = "SELECT CustomerID, Name, City, StateProvince FROM CUSTOMER";
    private static final String  EMAIL_SQL = "SELECT EmailAddress FROM EMAIL WHERE FK_CustomerID = ?";



    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(FIREDUP_URL, USERNAME, PASSWORD);
    }


    private ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> readCustomerBasics() {
        ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> customers = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(CUSTOMERS_SQL);
             ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                customers.add( new edu.pcc.cis233j.jdbctutorial.Customer( rs.getInt("CustomerID"),
                        rs.getString("Name") ,
                        rs.getString("City") ,
                        rs.getString("StateProvince")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> readCustomers()
    {
        ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> customers = readCustomerBasics();
        readEmailAddresses(customers);
        return customers;
    }

    public void readEmailAddresses(ArrayList<edu.pcc.cis233j.jdbctutorial.Customer> customers)
    {

    }


}
