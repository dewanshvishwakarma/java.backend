package program1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/studentservelt")
public class MyServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String id = req.getParameter( "studentId");
		String email=req.getParameter("email");
		String name = req.getParameter( "studentName");
		String addresh=req.getParameter( "address");
		
		PrintWriter writer=resp.getWriter();
		writer.println("student namr" + name);
		writer.println("Student id" + id);
		writer.println("Student addresh" + addresh);
		writer.println("Student email" + email);
	}

}
