package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String firstName=request.getParameter("firstname");  
        String lastName=request.getParameter("lastname");
        String email=request.getParameter("email");
        
        RegistrationBean bean=new RegistrationBean();
        bean.setFirstName(firstName);
        bean.setLastName(lastName);
        bean.setEmail(email);
		
        request.setAttribute("bean",bean);
        try {
			bean.regsiter();
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}
