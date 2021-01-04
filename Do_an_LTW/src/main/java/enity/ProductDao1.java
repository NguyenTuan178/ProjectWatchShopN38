package enity;

import bean.ProductDao;
import db.ConnectionDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ProductDao1 {

    public List<ProductDao> getProducDao() {

        Statement s = null;
        try {
            s = ConnectionDB.connect();
            List<ProductDao> re = new LinkedList<>();

            ResultSet rs = s.executeQuery("select * from product_dao ");
            while (rs.next()) {
                re.add(new ProductDao(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getLong(12),
                        rs.getLong(13)
                ));
            }
            rs.close();
            s.close();
            return re;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return new LinkedList<>();

        }
    }

    public static void main(String[] args) {
        System.out.println("helllo");
    }
}
