package phasetwomp1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class validate extends HttpServlet{

		/**
		 * servlet implementation class Validate
		 */


		public class HttpServlet {
			private static final long serialVersionUID = 1L;
			public String username,password;
		   
		  

			/**
			 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				
			}

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
				resp.setContentType("text/html");
				
				username=req.getParameter("username");
				password=req.getParameter("password");
				
				PrintWriter out=resp.getWriter();
				
				if ((username.equals("bhargav"))&&(password.equals("987654321"))) {
					out.println("Welcome Login Successful");
				}
				else {
					out.println("Login failed...............");
				}
				
			}
			
		}
		
	}
