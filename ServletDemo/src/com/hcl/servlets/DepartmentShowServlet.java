package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentShowServlet
 */
@WebServlet("/DepartmentShowServlet")
public class DepartmentShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection conn=DaoConnection.getConnection();
		String cmd="SELECT * FROM Department";
		PrintWriter out=response.getWriter();
		try {
			PreparedStatement pst=conn.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				out.println("Dept No "+rs.getInt("deptno")+"<br/>");
				out.println("Dept Name "+rs.getString("dname")+"<br/>");
				out.println("Department "+rs.getString("dept")+"<br/>");
				out.println("loaction "+rs.getString("dloc")+"<br/>");
				out.println("head "+rs.getInt("city")+"<br/><hr/>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
