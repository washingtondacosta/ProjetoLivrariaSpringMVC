package edu.unichristus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unichristus.dominio.Autor;
import edu.unichristus.dominio.Livro;
import edu.unichristus.repositorios.AutorRepository;
import edu.unichristus.repositorios.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService {

	private LivroRepository repositorioLivros;

	@Autowired
	public void setRepositorio(LivroRepository repositorio) {
		this.repositorioLivros = repositorio;
	}

	@Override
	public List<Livro> listarTodosLivros() {
		return repositorioLivros.findAll();
	}

	@Override
	public void salvar(Livro livro) {
		repositorioLivros.save(livro);

	}

}
