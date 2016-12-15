package edu.unichristus.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unichristus.dominio.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

	// OPERADORES DE STRING
	/*
	 * select livro0_.LIVRO_ID as LIVRO_ID1_0_, livro0_.DATA_PUBLICACAO as
	 * DATA_PUB2_0_, livro0_.NUMERO_PAGINAS as NUMERO_P3_0_, livro0_.PRECO as
	 * PRECO4_0_, livro0_.TITULO as TITULO5_0_ from LIVRO livro0_ where
	 * livro0_.TITULO=?
	 */
	public Livro findByTitulo(String titulo);

	public List<Livro> findByTituloLike(String titulo);

	public List<Livro> findByTituloContaining(String titulo);

	public List<Livro> findByTituloStartingWith(String titulo);

	public List<Livro> findByTituloEndingWith(String titulo);

	public List<Livro> findByTituloIgnoreCase(String titulo);
	
	// OPERADORES RELACIONAIS
	public List<Livro> findByNumeroPaginasEquals(int numeroPaginas);
	
	public List<Livro> findByNumeroPaginasGreaterThan(int numeroPaginas);
	
	public List<Livro> findByNumeroPaginasLessThan(int numeroPaginas);
	
	public List<Livro> findByNumeroPaginasGreaterThanEqual(int numeroPaginas);
	
	public List<Livro> findByNumeroPaginasLessThanEqual(int numeroPaginas);
	
	public List<Livro> findByNumeroPaginasBetween(int min, int max);
	
	// OPERADORES LÓGICOS
	public List<Livro> findByTituloContainingOrTituloContaining(String titulo1, String titulo2);
	
	public List<Livro> findByTituloContainingAndNumeroPaginasGreaterThan(String titulo, int numeroPaginas);
	
	public List<Livro> findByTituloNot(String titulo);
	
	// OPERADORES DE DATA
	public List<Livro> findByDataPublicacaoAfter(Date dataPublicacao);
	
	public List<Livro> findByDataPublicacaoBefore(Date dataPublicacao);
	
	public List<Livro> findByDataPublicacaoBetween(Date dataPublicacao1, Date dataPublicacao2);
	
	// ORDENANDO RESULTADOS
	public List<Livro> findByTituloContainingOrderByTituloAsc(String titulo);
	
	public List<Livro> findByTituloContainingOrderByTituloDesc(String titulo);
	
	
	
	

}
