package edu.unichristus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unichristus.dominio.Autor;
import edu.unichristus.repositorios.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {

	private AutorRepository repositorioAutores;

	@Autowired
	public void setRepositorio(AutorRepository repositorio) {
		this.repositorioAutores = repositorio;
	}

	@Override
	public List<Autor> listarTodosAutores() {
		return repositorioAutores.findAll();
	}

	@Override
	public void salvar(Autor autor) {
		repositorioAutores.save(autor);

	}

}
