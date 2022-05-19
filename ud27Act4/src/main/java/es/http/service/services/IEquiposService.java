package es.http.service.services;

import java.util.List;

import es.http.service.dto.Equipos;

public interface IEquiposService {
	//Metodos del CRUD
	public List<Equipos> listarEquipos(); //Listar All 
	
	public Equipos guardarEquipos(Equipos equipos);	//Guarda un cliente CREATE
	
	public Equipos equiposXID(int id); //Leer datos de un cliente READ
	
	public Equipos actualizarEquipos(Equipos equipos); //Actualiza datos del cliente UPDATE
	
	public void eliminarEquipos(int id);// Elimina el cliente DELETE
	
}
