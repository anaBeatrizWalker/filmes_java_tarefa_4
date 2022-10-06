package br.fatec.filmes.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Filme extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private String titulo;
	private Integer ano;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Ator> ator;
	
	public Filme () {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public List<Ator> getAtor() {
		return ator;
	}

	public void setAtor(List<Ator> ator) {
		this.ator = ator;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
