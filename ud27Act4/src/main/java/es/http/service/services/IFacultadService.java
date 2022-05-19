package es.http.service.services;

import java.util.List;

import es.http.service.dto.Facultad;

public interface IFacultadService {
	//Metodos del CRUD
	public List<Facultad> listarFacultad(); //Listar All 
	
	public Facultad guardarFacultad(Facultad facultad);	//Guarda un cliente CREATE
	
	public Facultad facultadXID(int id); //Leer datos de un cliente READ
	
	public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos del cliente UPDATE
	
	public void eliminarFacultad(int id);// Elimina el cliente DELETE
	
}
