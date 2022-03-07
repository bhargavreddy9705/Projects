package proj2;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class product {
	private static final long serialVersionUID = 1L;
	static Connection con=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();
		String id=request.getParameter("pid");
		Integer ID=Integer.parseInt(id);
		if(ID<1016) {
		out.print("<h1 >Display Record</h1>");
		out.print("<table border='1'><tr><th>Product_Id</th><th>Product_Name</th></th><th>Product_Price</th></tr>");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "admin";
		String password = "admin";
		try {
			con = DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from ProductItems where pid= "+id);
			while (rs.next()) {
				out.print("<tr><td>");
				out.print(rs.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getInt(3));
				out.print("</td>");
				out.print("</tr>");
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			out.print("The id "+ ID +" you are searching is not Present sorry! Try Again!!");
		}
		out.print("</table>");
	}
		}
