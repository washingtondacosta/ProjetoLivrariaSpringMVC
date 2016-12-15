package edu.unichristus.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EDITORA")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EDITORA_ID")
	private Long editoraID;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CIDADE")
	private String cidade;

	@OneToMany(mappedBy="editora")
	private List<Livro> livros;

	public Editora() {

	}

	public Editora(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	public Long getEditoraID() {
		return editoraID;
	}

	public void setEditoraID(Long editoraID) {
		this.editoraID = editoraID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Editora [editoraId=" + editoraID + ", nome=" + nome + ", cidade=" + cidade + "]";
	}

}
