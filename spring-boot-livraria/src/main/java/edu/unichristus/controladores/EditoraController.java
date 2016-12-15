package edu.unichristus.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.unichristus.dominio.Editora;
import edu.unichristus.service.EditoraService;

@Controller
@RequestMapping("/editora")
public class EditoraController {
	
	private EditoraService servicoEditoras;
	
	@Autowired
	public void setServicoEditoras(EditoraService servicoEditoras) {
		this.servicoEditoras = servicoEditoras;
	}
	
	@RequestMapping(value= "/cadastrar",method=RequestMethod.GET)
	String cadastrarEditora(Model modelo) {
		Editora editora = new Editora();
		modelo.addAttribute("editora", editora);
		return "novaEditoraForm";
	}
	
	@RequestMapping(value= "/cadastrar",method=RequestMethod.POST)
	String cadastrarEditora(@ModelAttribute Editora editora, Model modelo) {
		servicoEditoras.salvar(editora);
		modelo.addAttribute("sucesso", "inclusao");
		modelo.addAttribute("editoras", servicoEditoras.listarTodasEditoras());
		return "listarEditoras";
	}
	
	@RequestMapping("/listar")
	public String buscarTodasEditoras(Model modelo) {
		modelo.addAttribute("editoras", servicoEditoras.listarTodasEditoras());
		return "listarEditoras";
	}

}
