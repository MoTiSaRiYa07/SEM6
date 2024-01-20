import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String email = request.getParameter("email");
	        String fullName = request.getParameter("full_name");

	        try {
	            // Establish database connection
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem6", "root", "ramapir");

	            // Insert user into the database with additional details
	            String query = "INSERT INTO users (username, password, email, full_name) VALUES (?, ?, ?, ?)";
	            try (PreparedStatement pst = conn.prepareStatement(query)) {
	                pst.setString(1, username);
	                pst.setString(2, password);
	                pst.setString(3, email);
	                pst.setString(4, fullName);
	                pst.executeUpdate();
	            }

	            // Close the connection
	            conn.close();

	            // Redirect to login page
	            response.sendRedirect("login.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            response.getWriter().println("Error during signup");
	        }
	 }
}