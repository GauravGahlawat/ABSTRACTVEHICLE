import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbname", "root", "gaurav1997TISHA");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employees");
			while(rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getShort(3));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
