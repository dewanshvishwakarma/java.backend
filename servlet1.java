package preogram3HW;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet")
public class servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 double radius=Double.parseDouble(req.getParameter("radius"));
		 int side=Integer.parseInt(req.getParameter( "side"));
		 int length=Integer.parseInt(req.getParameter( "length"));
		 int breath=Integer.parseInt(req.getParameter( "breath"));
		 
		 
		 int areas=side*side;
		 int arear=length*breath;
		 double areac=3.14*radius*radius;
		 
		 req.setAttribute( "areas", areas);
		 req.setAttribute( "arear",arear);
		 req.setAttribute( "areac",areac);
		 
		 RequestDispatcher rd =req.getRequestDispatcher( "/servlet2");
		 rd.forward(req, resp);
		 
		 
		 
	}
	

}
