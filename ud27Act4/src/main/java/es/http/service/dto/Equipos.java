package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="equipos")
public class Equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="nombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "facultad_id")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Reservas> reserva;
	
	

	public Equipos() {
		
	}
	
	public Equipos(int id, String nombre, Facultad facultad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reservas")
	public List<Reservas> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reservas> reserva) {
		this.reserva = reserva;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	
	
}
