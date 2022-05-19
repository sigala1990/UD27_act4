package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;



import es.http.service.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{

}
