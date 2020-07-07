package package1;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Scratchcard extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String message;
	public Servlet serv = new Servlet();
	
		public void init() throws ServletException{
			
			 message = "Refresh page for a new chance to win";
		}
		
		public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.println("<h1 style=\"text-align:center;\">" + message + "</h1>");
			out.println(serv.printMatrix(serv.tryAgain(3), 3));
			 
		}
		
		public void destroy() {
			
			//do nothing
		}


}
