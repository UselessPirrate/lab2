import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    static Connection conn;
    public static void main(String[] arts) throws SQL{
        conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info");
        LocalDate N = LocalDate.of(2023, 01,18);
        String SQL_QUERY =String.format (
                        """
                DISTINCT SELECT teacher_fullname
                FROM     grade_book;
                        """

        , N.format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
        PreparedStatement studentsQuery = conn.prepareStatement(SQL_QUERY);
        ResultSet professorSet = studentsQuery.executeQuery();
        System.out.println("ФИО".repeat(10));
        while (professorSet.next()){
            System.out.println(professorSet.getString(1 )+ " " + professorSet.getString(2 )+ " "+ professorSet.getString(3 ));
        }

    }

}
