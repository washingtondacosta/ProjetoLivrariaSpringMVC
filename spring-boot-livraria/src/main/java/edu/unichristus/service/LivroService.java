package edu.unichristus.service;

import java.util.List;

import edu.unichristus.dominio.Livro;

public interface LivroService {

	List<Livro> listarTodosLivros();

	void salvar(Livro livro);

}
