import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter();  
request.getRequestDispatcher("page.html").include(request, response);  
String name=request.getParameter("name");  
String password=request.getParameter("password");  
if(password.equals("1234")){ 
	out.print("Hi, "+name);  
	out.print("<br>successfully logged in!You can use the store cart");  
Cookie ck=new Cookie("name",name);  
response.addCookie(ck);  
}else{  
out.print("sorry, username or password error!");  
request.getRequestDispatcher("login.html").include(request, response);  
}  

out.close();  
}  
	}  