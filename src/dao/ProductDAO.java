package dao;
import model.Product;
import util.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {

    static Connection conn;
    static {
        try {
            conn = DBconnection.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void exitConn() throws SQLException {
        conn.close();
    }

    public static void addNewProduct(Product product) throws SQLException {

        String sql = "INSERT INTO products (name, description, category, price, stock, image_url, active) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, product.getName());
        ps.setString(2, product.getDescription());
        ps.setString(3, product.getCategory());
        ps.setFloat(4, product.getPrice());
        ps.setInt(5, product.getStock());
        ps.setString(6, product.getImage_url());
        ps.setBoolean(7, product.getActive());



        ps.executeUpdate();

        System.out.println("Added successfully");
    }

    public static void seeProduct() throws SQLException {

        String sql = "SELECT * FROM products";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println(rs.getInt("id") + ". " + rs.getString("name")
                    + " / " + rs.getString("description")
                    + " / " + rs.getFloat("price")
                    + " / " + rs.getInt("stock")
                    + " / " + rs.getBoolean("active"));
        }
    }

    public static void deleteProduct(String name) throws SQLException {

        String sql = "DELETE FROM products WHERE name = ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, name);

        ps.executeUpdate();
        System.out.println("Deleted successfully");

    }



}
