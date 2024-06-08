import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/mylogin")

public class LoginForm extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException,IOException
		{
			String myemail=(String) req.getParameter("Email");
			String mypass=(String) req.getParameter("Password");
			
			if(myemail.equals("deepa@gmail.com") && mypass.equals("123deepa"))
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("failed");
			}
		}
}
