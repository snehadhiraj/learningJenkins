package demoJdbc;
import java.sql.*;

public class myConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbUrl="jdbc:mysql://localhost:3306/courses";
		String user="root";
		String pass="Dhiraj@123";
		
		Connection myConn=DriverManager.getConnection(dbUrl,user,pass);
        Statement st=myConn.createStatement();
        ResultSet rs=st.executeQuery("select * from demo1 where id=101");
        rs.next();
        int id=rs.getInt("ID");
        String name=rs.getString("cname");
        System.out.println(id+ " " +name);
        st.close();
        
	}

}
