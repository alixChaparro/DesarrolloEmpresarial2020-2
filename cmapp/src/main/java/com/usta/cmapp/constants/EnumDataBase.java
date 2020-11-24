package com.usta.cmapp.constants;

/**
 * Contiene valores constantes que jamas van a cambiar en la aplicacion
 * @author ALIX CHAPARRO
 *
 */
public enum EnumDataBase {
	MYSQL(1, "Mysql"),
	POSTGRESQL(2,"Postgresql");
	
	private int id; 
	private String description;
	
	private EnumDataBase(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	
	
	
}
