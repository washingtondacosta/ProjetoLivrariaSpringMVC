package edu.unichristus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unichristus.dominio.Editora;
import edu.unichristus.repositorios.EditoraRepository;

@Service
public class EditoraServiceImpl implements EditoraService {

	private EditoraRepository repositorioEditoras;

	@Autowired
	public void setRepositorio(EditoraRepository repositorio) {
		this.repositorioEditoras = repositorio;
	}

	@Override
	public List<Editora> listarTodasEditoras() {
		return repositorioEditoras.findAll();
	}

	@Override
	public void salvar(Editora editora) {
		repositorioEditoras.save(editora);

	}

}
