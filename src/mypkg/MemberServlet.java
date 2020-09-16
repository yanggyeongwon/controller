package mypkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("*.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberServlet() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	public void destroy() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		doProcess(request, response);
	}
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		int len = contextPath.length();
		
		String viewPage = "";
		String result = uri.substring(len);
		
		MemberCommand mcommand = null; 
		
		if(result.equals("/insertProc.do")) {
			
			mcommand = new MInsertCommand();
			mcommand.excute(request, response);
			viewPage = "/list.do";
			
		}else if(result.equals("/list.do")) {
			
			mcommand = new MListCommand();
			mcommand.excute(request, response);
			viewPage = "list.jsp";
			
		}else if(result.equals("/delete.do")) {
			
			
			
		}else if(result.equals("/updateForm.do")) {
			
			
			
		}else if(result.equals("/updateProc.do")) {
			
			
			
		}
		RequestDispatcher disp = request.getRequestDispatcher(viewPage);
		disp.forward(request, response);
	}
}
