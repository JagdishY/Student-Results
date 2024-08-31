package mvc;

import java.sql.*;

public class ResultsDAO 
{
	Connection con;
	
    public ResultsDAO() 
    {
    	
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    ResultBean getResults(int hno)
    {
    	ResultBean rb=null;
    try
    {
		PreparedStatement pstmt = con.prepareStatement("select * from results where hno=?");
		pstmt.setInt(1, hno);
		ResultSet rs = pstmt.executeQuery();  // DB DATA Stored in ResultSet 
		rs.next();  // true 
		rb = new ResultBean();
		rb.setHno(rs.getInt("hno"));
		rb.setName(rs.getString("name"));
		rb.setC(rs.getInt("c"));
		rb.setCpp(rs.getInt("cpp"));
		rb.setJava(rs.getInt("java"));
	} catch (SQLException e) 
    {
		e.printStackTrace();
	}	
    return rb;
   }

}
