package es.http.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.DAO.IEquiposDAO;
import es.http.service.dto.Equipos;
@Service
public class EquiposServiceImpl implements IEquiposService{

	@Autowired
	IEquiposDAO iEquiposDAO;

	@Override
	public List<Equipos> listarEquipos() {
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos equipos) {
		return iEquiposDAO.save(equipos);
	}

	@Override
	public Equipos equiposXID(int id) {
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos equipos) {
		return iEquiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		iEquiposDAO.deleteById(id);
	}


}
