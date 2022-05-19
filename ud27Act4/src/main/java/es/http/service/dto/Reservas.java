package es.http.service.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reservas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column 
	private LocalDate comienzo;
	@Column 
	private LocalDate fin;
	@ManyToOne
	@JoinColumn(name ="investigador_id")
	Investigadores investigadores;
	@ManyToOne
	@JoinColumn(name ="equipo_id")
	Equipos equipos;
		
	public Reservas() {
	}

	public Reservas(int id, LocalDate comienzo, LocalDate fin, Investigadores investigadores, Equipos equipos) {
		//super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDate comienzo) {
		this.comienzo = comienzo;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public Investigadores getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(Investigadores investigadores) {
		this.investigadores = investigadores;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}
	
	
	
	
}
