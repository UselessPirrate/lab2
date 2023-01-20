import java.sql.*;
import java.time.LocalDate;

public class Main {
    static Connection conn;
    public static void main(String[] arts) throws SQL{
        conn =
                DriverManager.getConnection();
        LocalDate N = LocalDate.of(2023.01.18);
        String SQL_QUERY =String.format (
                        """
                DISTINGT SELECT teacher_fullname
                FROM     grade_book;
                        """

        )
        PreparedStatement studentsQuery = conn.prepareStatement(SQL_QUERY);
        ResultSet studentSet = studentsQuery.executeQuery();
        System.out.println("ФИО".repeat(10));
        while (studentSet.next()){
            System.out.println(studentSet.getString(1 +))
        }

    }

}
