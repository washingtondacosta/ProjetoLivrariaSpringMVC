package edu.unichristus.service;

import java.util.List;

import edu.unichristus.dominio.Autor;

public interface AutorService {
	
	List<Autor> listarTodosAutores();
	
	void salvar(Autor autor);

}
