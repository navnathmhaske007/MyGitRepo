import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "mymomdad");
			System.out.println(con);
			
			java.sql.Statement st = con.createStatement();
			//System.out.println(st);
			
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
