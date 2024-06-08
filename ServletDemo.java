import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/SubmitForm")
public class ServletDemo extends HttpServlet
{	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			String myname=req.getParameter("Name") ;
			String myemail=req.getParameter("Email");
			
			// for console
			System.out.println("Name : "+myname);
			System.out.println("Email : "+myemail);
			
			//for browser
			PrintWriter out=resp.getWriter();
			out.println("Name : "+myname);
			out.println("Email : "+myemail);
		}
}
