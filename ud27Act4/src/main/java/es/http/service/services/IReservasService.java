package es.http.service.services;

import java.util.List;

import es.http.service.dto.Reservas;

public interface IReservasService {
	//Metodos del CRUD
	public List<Reservas> listarReservas(); //Listar All 
	
	public Reservas guardarReservas(Reservas reservas);	//Guarda un cliente CREATE
	
	public Reservas reservasXID(int id); //Leer datos de un cliente READ
	
	public Reservas actualizarReservas(Reservas reservas); //Actualiza datos del cliente UPDATE
	
	public void eliminarReservas(int id);// Elimina el cliente DELETE
	
}
