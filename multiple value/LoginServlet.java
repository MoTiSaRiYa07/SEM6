

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // For simplicity, let's assume a hardcoded username and password
//        String validUsername = "user";
//        String validPassword = "password";
//        
        String validUsername = "ankush";
        String validPassword = "1234";

        // Check if the entered credentials are valid
        if (validUsername.equals(username) && validPassword.equals(password)) {
            // Credentials are valid, set the username as an attribute and forward to welcome.jsp
            request.setAttribute("username", username);
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        } else {
            // Credentials are invalid, set an error message and forward back to login.jsp
            request.setAttribute("errorMessage", "Login failed. Please check your username and password.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
		
			}

}
