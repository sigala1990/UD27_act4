package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="investigadores")//en caso que la tabala sea diferente
public class Investigadores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="nomapels")
	private String nomapels;
	
	@ManyToOne
	@JoinColumn(name = "facultad_id")
	Facultad facultad;
	
	public Investigadores() {
		
	}

	public Investigadores(int id, String nomapels, Facultad facultad) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.facultad = facultad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	
	
}
