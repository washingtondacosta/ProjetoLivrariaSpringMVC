package edu.unichristus.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_AUTOR")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTOR_ID")
	private Long autorID;

	@Column(name = "PRIMEIRO_NOME")
	private String primeiroNome;

	@Column(name = "ULTIMO_NOME")
	private String ultimoNome;

	@Column(name = "PAIS")
	private String pais;

	// Autor é o proprietário da relação many to many
	@ManyToMany
	@JoinTable(name = "TB_AUTORES_LIVROS")
	private List<Livro> livros;

	public Autor() {

	}

	public Autor(String primeiroNome, String ultimoNome, String pais) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.pais = pais;
	}

	public Long getAutorID() {
		return autorID;
	}

	public void setAutorID(Long autorID) {
		this.autorID = autorID;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Autor [autorId=" + autorID + ", primeiro Nome=" + primeiroNome + ", �ltimo Nome=" + ultimoNome
				+ ", pa�s=" + pais + "]";
	}

}
