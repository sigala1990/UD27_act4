package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Equipos;

public interface IEquiposDAO extends JpaRepository<Equipos, Integer>{

}
