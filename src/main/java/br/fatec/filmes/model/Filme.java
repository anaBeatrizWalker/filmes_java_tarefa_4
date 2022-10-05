package br.fatec.filmes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Filme extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private String titulo;
	private Integer ano;
	
	@ManyToMany
	@JoinTable(name = "filme_ator", joinColumns=@JoinColumn(name="fk_filme_id"), inverseJoinColumns = @JoinColumn(name="fk_ator_id"))
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
