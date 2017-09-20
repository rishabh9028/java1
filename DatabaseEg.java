
import java.sql.*;

public class DatabaseEg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg316","training316");
		/*Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from cap_emp_table2");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getString(5));
		}
	
		con.close();*/
		PreparedStatement ps=con.prepareStatement("insert into cap_emp_table2 values(?,?,?,?,?)");
		ps.setInt(1,109);
		ps.setString(2,"Amit");
		ps.setInt(3,18070);
		ps.setDouble(4,952367215);
		ps.setString(5,"Pashan");
		
		int r=ps.executeUpdate();
		System.out.println(r+"Rows inserted");
		
		
		
	}

}
