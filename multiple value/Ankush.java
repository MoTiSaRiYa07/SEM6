

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ankush
 */
public class Ankush extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ankush() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("Your Given Details Here");
		writer.println("<br><br>");
		
		String name=req.getParameter("fname");
		String contact=req.getParameter("contact");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		String duration=req.getParameter("duration");
		String course=req.getParameter("course");
		String[] values=req.getParameterValues("hobbies");
		
		writer.println("Name :"+name);
		writer.println("<br>");
		writer.println("Contact No : "+contact);
		writer.println("<br>");
		writer.println("Gender : "+gender);
		writer.println("<br>");
		writer.println("Address  : "+address);
		writer.println("<br>");
		writer.println("Course  : "+course);
		writer.println("<br>");
		writer.println("Duration  : "+duration);
		writer.println("<br>");
		writer.println("Hobbies are : ");
		writer.println("<br>");
		for(int i=0;i<values.length;i++)
		{
			writer.println("<li>"+values[i]+"</li>");
		}

			}

}
