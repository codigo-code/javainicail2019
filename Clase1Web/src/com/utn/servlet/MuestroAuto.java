package com.utn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.connection.ConnectionMySQL;
import com.utn.modelo.Auto;

public class MuestroAuto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		ConnectionMySQL cm = new ConnectionMySQL();
		
		Auto autito= cm.getAutoById(id);
		req.setAttribute("autoObjeto", autito);
		RequestDispatcher dispatcher = req.getRequestDispatcher("muestroAuto.jsp");
		dispatcher.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
