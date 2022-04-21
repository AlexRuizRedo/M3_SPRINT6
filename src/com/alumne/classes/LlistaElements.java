package com.alumne.classes;

import com.alumne.dbconnection.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LlistaElements {
	private ArrayList<Element> elements = new ArrayList<Element>();
	private ConnectionJDBC connection = new ConnectionJDBC();
	private int posicio = 0;
	
	//Getters i setters
	public ArrayList<Element> getElements() {
		elements.clear();
		select_elements();
		return elements;
	}

	public int getPosicio() {
		return posicio;
	}

	public void setPosicio(int posicio) {
		this.posicio = posicio;
	}

	//Constructor
	public LlistaElements() {
		select_elements();
	}
	
	//Mètodes
	public void select_elements() {
		String query = "select * from projects";
		connection.setPreparedStatement(query);
		PreparedStatement statement = connection.getPreparedStatement();
		try {
			ResultSet resultset = statement.executeQuery();
			if (resultset != null) {			
				while (resultset.next()) {
					int id = resultset.getInt("id");
					String field1 = resultset.getString("title");
					String field2 = resultset.getString("location");
					String field3 = resultset.getString("description");

					Element x = new Element(id, field1, field2, field3);
					elements.add(x);
					System.out.println("" + id + field1 + field2 + field3);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Falla LlistaElements");
		}
	}
	
}
