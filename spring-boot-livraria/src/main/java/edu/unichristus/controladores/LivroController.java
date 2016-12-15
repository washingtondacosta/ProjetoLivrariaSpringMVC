package edu.unichristus.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unichristus.dominio.Livro;
import edu.unichristus.service.LivroService;

@Controller
@RequestMapping("/livro")
public class LivroController {

	private LivroService servicoLivros;

	@Autowired
	public void setServicoLivros(LivroService servicoLivros) {
		this.servicoLivros = servicoLivros;
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	String cadastrarLivro(Model modelo) {
		Livro livro = new Livro();
		modelo.addAttribute("livro", livro);
		return "novoLivroForm";
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	String cadastrarLivro(@ModelAttribute Livro livro, Model modelo) {
		System.out.println("Entrou em cadastrar livro");
		System.out.println(livro);
		servicoLivros.salvar(livro);
		modelo.addAttribute("sucesso", "inclusao");
		modelo.addAttribute("livros", servicoLivros.listarTodosLivros());
		return "listarLivros";
	}

	@RequestMapping("/listar")
	public String buscarTodosLivros(Model modelo) {
		modelo.addAttribute("livros", servicoLivros.listarTodosLivros());
		return "listarLivros";
	}

}
