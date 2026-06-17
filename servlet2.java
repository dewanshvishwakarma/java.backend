package preogram3HW;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 double areac=(Double)req.getAttribute( "areac");
		 int areas=(Integer)req.getAttribute( "areas");
		 int arear=(Integer)req.getAttribute( "arear");
		 
		 PrintWriter writer=resp.getWriter();
		 writer.println( "area of circle = " + areac);
		 writer.println( "area of rectange = " + arear);
		 writer.println( "area of square = " + areas);
	}
 
}
