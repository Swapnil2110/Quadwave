package maccess;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add") 
public class AddEmp extends GenericServlet
{
	
	public Dao id = null; 
	public beanfile eb = null; 
	
	public void init() throws javax.servlet.ServletException {
		id = new Dao();
		eb = new beanfile();
	}
	public void service(ServletRequest req, ServletResponse res) throws 
	ServletException,IOException{
		eb.setEmpid(req.getParameter("slct1")); 
		eb.setEmpname(req.getParameter("slct2"));
		eb.setYerofexp(Integer.parseInt(req.getParameter("exp")));
		eb.setDesg(req.getParameter("deg"));
		int k = id.insert(eb);
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		if(k>0) {
			pw.println("Employee added successfully....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req,res);
		}
		else{
			pw.println("not successfully try again....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html"); 
			rd.include(req,res);
		}
	}
}