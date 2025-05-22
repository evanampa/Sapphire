import dao.ProductDAO;
import model.Product;
import util.DBconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    static void addProduct() throws SQLException {
        String name,description, category, image_url,price,stock,active;
        boolean activeBool=false;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Give the name of the product");
        name=scanner.nextLine();

        System.out.println("Give the description of the product");
        description=scanner.nextLine();

        System.out.println("Give the category of the product");
        category=scanner.nextLine();

        System.out.println("Give the price of the product");
        price=scanner.nextLine();

        System.out.println("Give the stock of the product");
        stock=scanner.nextLine();

        System.out.println("Give the image url of the product");
        image_url=scanner.nextLine();

        System.out.println("Give the active of the product");
        active=scanner.nextLine();

        if(active.equals("true")){activeBool=true;}

        Product pr= new Product(name,description,category,Float.parseFloat(price), Integer.parseInt(stock),image_url,activeBool);

        ProductDAO.addNewProduct(pr);
    }

    static void deleteProduct() throws SQLException {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the name of the product");
        name = scanner.nextLine();

        ProductDAO.deleteProduct(name);
    }

    public static void main(String[] args) {
        try {
            Connection conn = DBconnection.getConnection();
            System.out.println("Connected successfully");
            boolean keepRunning = true;
            Scanner scanner = new Scanner(System.in);

            while(keepRunning){
                System.out.println("you want to see or add or delete products");

                String answer = scanner.nextLine().toLowerCase();

                switch (answer){
                    case "add":
                        addProduct();
                        break;
                    case "see":
                        ProductDAO.seeProduct();
                        break;
                    case "delete":
                        deleteProduct();
                        break;
                    case "exit":
                        ProductDAO.exitConn();
                        keepRunning=false;
                        break;

                }
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Failed to connect to database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
