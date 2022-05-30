import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("page.html").include(request, response);  
          
        Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
		int p1=Integer.parseInt(request.getParameter("p1"));
		int r1=Integer.parseInt(request.getParameter("r1"));
		
		int p2=Integer.parseInt(request.getParameter("p2"));
		int r2=Integer.parseInt(request.getParameter("r1"));
		
		int p3=Integer.parseInt(request.getParameter("p3"));
		int r3=Integer.parseInt(request.getParameter("r1"));
		
		int p4=Integer.parseInt(request.getParameter("p4"));
		int r4=Integer.parseInt(request.getParameter("r4"));
		
		int p5=Integer.parseInt(request.getParameter("p5"));
		int r5=Integer.parseInt(request.getParameter("r5"));
		
		int p6=Integer.parseInt(request.getParameter("p6"));
		int r6=Integer.parseInt(request.getParameter("r6"));
		
		int p7=Integer.parseInt(request.getParameter("p7"));
		int r7=Integer.parseInt(request.getParameter("r7"));
		
		int p8=Integer.parseInt(request.getParameter("p8"));
		int r8=Integer.parseInt(request.getParameter("r8"));
		
		int p9=Integer.parseInt(request.getParameter("p9"));
		int r9=Integer.parseInt(request.getParameter("r9"));
		
		int p10=Integer.parseInt(request.getParameter("p10"));
		int r10=Integer.parseInt(request.getParameter("r10"));
		
		int total=(p1*r1)+(p2*r2)+(p3*r3)+(p4*r4)+(p5*r5)+(p6*r6)+(p7*r7)+(p8*r8)+(p9*r9)+(p10*r10);
		out.println("total price is" + total);
		
	}
        }else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }  
}  