package es.http.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.DAO.IInvestigadoresDAO;
import es.http.service.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService{
	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public Investigadores investigadoresXID(int id) {
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		iInvestigadoresDAO.deleteById(id);
	}


}
