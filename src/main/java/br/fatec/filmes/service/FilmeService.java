package br.fatec.filmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.filmes.model.Filme;
import br.fatec.filmes.repository.FilmeRepository;

@Service
public class FilmeService implements ServiceInterface<Filme> {
	
	@Autowired
	private FilmeRepository repo;
	
	public FilmeService() {}
	
	@Override
	public Filme create(Filme obj) {
		repo.save(obj);
		return obj;
	}
	
	@Override
	public List<Filme> findAll(){
		return repo.findAll();
	}
	
	@Override
	public Filme findById(Long id) {
		Optional<Filme> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Filme obj) {
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
