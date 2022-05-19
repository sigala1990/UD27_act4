package es.http.service.services;

import java.util.List;

import es.http.service.dto.Investigadores;

public interface IInvestigadoresService {
	//Metodos del CRUD
	public List<Investigadores> listarInvestigadores(); //Listar All 
	
	public Investigadores guardarInvestigadores(Investigadores investigadores);	//Guarda un cliente CREATE
	
	public Investigadores investigadoresXID(int id); //Leer datos de un cliente READ
	
	public Investigadores actualizarInvestigadores(Investigadores investigadores); //Actualiza datos del cliente UPDATE
	
	public void eliminarInvestigadores(int id);// Elimina el cliente DELETE
	
}
