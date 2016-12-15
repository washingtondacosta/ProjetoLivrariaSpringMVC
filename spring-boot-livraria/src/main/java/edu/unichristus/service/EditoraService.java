package edu.unichristus.service;

import java.util.List;

import edu.unichristus.dominio.Editora;

public interface EditoraService {
	
	List<Editora> listarTodasEditoras();
	
	void salvar(Editora editora);

}
