package com.usta.covid_app.interfaces;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IObjectQueryPostgres<T> {
	/**
	 * Método que se encarga de crear el objeto a persistir
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void create(T t) throws Exception;

	/**
	 * Método encargado de buscar y listar todos los objetos de la consulta deseada
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<T> findAll(Class<T> t) throws Exception;

	/**
	 * Método de encontrar por el id el objeto buscado
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T findById(Integer id, Class<T> object) throws Exception;

	/**
	 * Método para realizar cualquier cambio o modificación sobre un dato de un
	 * objeto
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void update(T t) throws Exception;

	/**
	 * Elimina un onjeto dependiendo del id que se solicite borrar
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Integer id, Class<T> object) throws Exception;

	/**
	 * Busca el usuario según credenciales
	 * 
	 * @param user
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, String password) throws Exception;

	/**
	 * Recuperamos contrasenia del usuario 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public T requieredPass(String user) throws Exception;
	
	/**
	 * busca persona por el numero de documento
	 * @param documento
	 * @return
	 * @throws Exception
	 */
	public T searchPersonByDocument(String documento) throws Exception;
}
