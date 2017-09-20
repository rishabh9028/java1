import java.io.IOException;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Connection con=DButil.getConnection();
		/*Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from cap_emp_table2");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getString(5));
		}
	
		con.close();*/
		PreparedStatement ps=con.prepareStatement("insert into cap_emp_table2 values(?,?,?,?,?)");
		ps.setInt(1,110);
		ps.setString(2,"Ajay");
		ps.setInt(3,18080);
		ps.setDouble(4,952337215);
		ps.setString(5,"Pune");
		
		int r=ps.executeUpdate();
		System.out.println(r+"Rows inserted");
		
		
		
	}

}
