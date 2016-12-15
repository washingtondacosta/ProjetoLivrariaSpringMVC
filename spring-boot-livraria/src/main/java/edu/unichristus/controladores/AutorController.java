package edu.unichristus.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.unichristus.dominio.Autor;
import edu.unichristus.service.AutorService;

@Controller
@RequestMapping("/autor")
public class AutorController {

	private AutorService servicoAutores;

	@Autowired
	public void setServicoAutores(AutorService servicoAutores) {
		this.servicoAutores = servicoAutores;
	}

	@RequestMapping(value= "/cadastrar",method=RequestMethod.GET)
	String cadastrarAutor(Model modelo) {
		Autor autor = new Autor();
		modelo.addAttribute("autor", autor);
		return "novoAutorForm";
	}
	
	@RequestMapping(value= "/cadastrar",method=RequestMethod.POST)
	String cadastrarAutor(@ModelAttribute Autor autor, Model modelo) {
		servicoAutores.salvar(autor);
		modelo.addAttribute("sucesso", "inclusao");
		modelo.addAttribute("autores", servicoAutores.listarTodosAutores());
		return "listarAutores";
	}

	@RequestMapping("/listar")
	public String buscarTodosAutores(Model modelo) {
		modelo.addAttribute("autores", servicoAutores.listarTodosAutores());
		return "listarAutores";
	}

}
