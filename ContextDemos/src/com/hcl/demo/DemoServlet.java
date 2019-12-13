package com.hcl.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig cfg=getServletConfig();
		String course=cfg.getInitParameter("course");
		PrintWriter out=response.getWriter();
		out.println("Course is " +course+ "<br/>");
		String venue=cfg.getInitParameter("venue");
		PrintWriter out1=response.getWriter();
		out.println("venue is " +venue+ "<br/>");
		String company=cfg.getInitParameter("company");
		PrintWriter out2=response.getWriter();
		out.println("company is " +company+ "<br/>");
		ServletContext ctx=getServletContext();
		out.println(ctx.getInitParameter("driver"));
		out.println(ctx.getInitParameter("connection"));
		out.println(ctx.getInitParameter("user"));
		out.println(ctx.getInitParameter("pwd"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
