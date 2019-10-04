package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.*;


@WebServlet("/Hello.do")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Resource(name="jdbc/kittu")
	//private DataSource datasource;
	//rivate Connection connection=null;
	private DataSource dataSource;
	private Connection connection=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		connection=dataSource.getConnection();
			System.out.println("conn is done");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		PrintWriter out=response.getWriter();
		out.print("hello to servlet 3.1 API");
		
		
		
	}

}
