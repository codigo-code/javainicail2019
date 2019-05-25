package com.utn.model.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utn.model.Pregunta;

public class PreguntaDAO {

	Connection conn;
	private static PreguntaDAO preguntaObj = null;

	// singleton
	private PreguntaDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/utn", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static PreguntaDAO createInstance() {

		if (preguntaObj == null) {
			preguntaObj = new PreguntaDAO();
		}
		return preguntaObj;
	}

	public void guardoPregunta(Pregunta pregunta) {
		try {

			String sql = "insert into pregunta (pregunta,respuesta) values (?,?)";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, pregunta.getPregunta());
			ps.setString(2, pregunta.getRespuesta());

			ps.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	

}
