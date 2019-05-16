package com.utn.connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.utn.modelo.Auto;

public class ConnectionMySQL {

	private Connection getConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/utn", "root", "");

			return conn;

		} catch (Exception e) {
			return null;
		}
	}

	public void getAutos() {

		try {
			Statement st = (Statement) getConnection().createStatement();
			ResultSet rs = st.executeQuery("select * from auto");
			while (rs.next()) {
				System.out.println("VEHICULO N " + rs.getInt("id"));
				System.out.println(rs.getString("marca"));
				System.out.println(rs.getString("modelo"));
				System.out.println(rs.getString("color"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Rompio");
		}
	}
	
	public Auto getAutoById(int id) {
		try {
			Statement st =(Statement) getConnection().createStatement();
			String query = "select * from auto where id="+id;
			
			ResultSet rs = st.executeQuery(query);
			Auto a= new Auto();
			while(rs.next()) {
				a.setMarca(rs.getString("marca"));
				a.setModelo(rs.getString("modelo"));
				a.setColor(rs.getString("color"));
			}
			return a;
		} catch (Exception e) {
			return null;
		}
		
	}

	public boolean insertAuto(String marca, String modelo, String color) {
		try {
			Statement st = (Statement) getConnection().createStatement();

			String query = "insert into auto (marca,modelo,color) " + "values('" + marca + "','" + modelo + "','"
					+ color + "')";

			return st.execute(query);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateAuto(String color, int id) {
		try {
			Statement st = (Statement) getConnection().createStatement();
			String query = "update auto set color = '" + color + "' where id=" + id;
			
			return !st.execute(query);
				
		} catch (Exception e) {
			
			return true;
		}
	}
	
	public boolean deleteAutoById(int id) {
		try {
			Statement st = (Statement) getConnection().createStatement();
			
			String query = "delete from auto where id="+id;
			
			return !st.execute(query);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
	}

	public List<Auto> getListOfAutos() {

		try {
			Statement st = (Statement) getConnection().createStatement();
			List<Auto> lista = new ArrayList<Auto>();
			ResultSet rs = st.executeQuery("select * from auto");
			while (rs.next()) {
				lista.add(new Auto(rs.getString("marca"),rs.getString("modelo"),rs.getString("color")));
			}
 
			return lista;
		} catch (Exception e) {
			return null;
		} finally {

		}
	}
	
}
