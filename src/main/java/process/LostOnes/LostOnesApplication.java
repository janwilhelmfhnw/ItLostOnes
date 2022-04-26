package process.LostOnes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LostOnesApplication {

    public static void main(String[] args) {


// MySQL Connection: PG
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "LostOnesPW");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from transportcosts");

            while (resultSet.next()) {

                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("cost"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

// Method: id extractor from input values   - id is defined as. 1 = 1 pal bis 30km, 2 = 2 pal bis 30km..13 =1 pal bis 60km etc. PG
public static void idExtract(int pal, double distance) {
            double d;
            d = distance;

            distance / 30 = remainder;
            distance -=

        }
    }
}
