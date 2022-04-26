package process.LostOnes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LostOnesApplication {

    public static void main(String[] args) {



        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhohst:3306/jdbc", "root", "xxx");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from transportcosts");

            while (resultSet.next()) {

                System.out.println(resultSet.getString("id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
