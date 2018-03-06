package h;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello2
 */
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Hello World";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      
	      out.println("<form action = \"HelloForm\" method = \"POST\">\r\n" + 
	      		"         First Name: <input type = \"text\" name = \"first_name\">\r\n" + 
	      		"         <br />\r\n" + 
	      		"         Last Name: <input type = \"text\" name = \"last_name\" />\r\n" + 
	      		"         <input type = \"submit\" value = \"Submit\" />\r\n" + 
	      		"      </form>");
	      
	      
	      if(request.getParameter("first_name")!=null) {
	    	  out.println(docType +
	    		         "<html>\n" +
	    		            "<head><title>" + title + "</title></head>\n" +
	    		            "<body bgcolor = \"#f0f0f0\">\n" +
	    		               "<h1 align = \"center\">" + title + "</h1>\n" +
	    		            " <h2> Hello " + request.getParameter("first_name")+
	    		            " " + request.getParameter("last_name")+
	    		               /*"<ul>\n" +
	    		                  "  <li><b>First Name</b>: "
	    		                  + request.getParameter("first_name") + "\n" +
	    		                  "  <li><b>Last Name</b>: "
	    		                  + request.getParameter("last_name") + "\n" +
	    		               "</ul>\n" +*/
	    		            "</body>" +
	    		        " </html>"
	    		      );

	      }
	      
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out = response.getWriter();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		
		out.print(" <html> <h1>Hello firstname: "+firstname+ " lastname: "+ lastname + " </h1> </html>");*/	
		doGet(request, response);
	}
}
