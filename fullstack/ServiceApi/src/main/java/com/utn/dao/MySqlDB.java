package com.utn.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utn.model.Usuario;

public class MySqlDB {
	
	public void saveUser(Usuario usuario) {
		try {
			String sql = "insert into user (user,pass) values (?,?)";
			PreparedStatement st = (PreparedStatement) getConnection().prepareStatement(sql);
			st.setString(1, usuario.getUser());
			st.setString(2, usuario.getPassword());
			st.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/utn","root","");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
