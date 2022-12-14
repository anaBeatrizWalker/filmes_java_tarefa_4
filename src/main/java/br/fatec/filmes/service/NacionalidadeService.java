package br.fatec.filmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.filmes.model.Nacionalidade;
import br.fatec.filmes.repository.NacionalidadeRepository;

@Service
public class NacionalidadeService implements ServiceInterface<Nacionalidade> {
	
	@Autowired
	private NacionalidadeRepository repo;
	
	public NacionalidadeService() {}
	
	@Override
	public Nacionalidade create(Nacionalidade obj) {
		repo.save(obj);
		return obj;
	}
	
	@Override
	public List<Nacionalidade> findAll(){
		return repo.findAll();
	}
	
	@Override
	public Nacionalidade findById(Long id) {
		Optional<Nacionalidade> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Nacionalidade obj) {
		if(repo.existsById(obj.getId())) {
			repo.save(obj);
			return true;
		}return false;
	}
	
	@Override 
	public boolean delete(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return true;
		}return false;
	}
}
