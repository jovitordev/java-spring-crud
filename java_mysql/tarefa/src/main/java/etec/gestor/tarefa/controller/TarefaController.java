package etec.gestor.tarefa.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etec.gestor.tarefa.model.Tarefas;
import etec.gestor.tarefa.repository.Tarefa;


@Controller //notação
public class TarefaController {
	
	@Autowired
	Tarefa repository;

	//página principal------------------------------------------
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	//cadastrar tarefa------------------------------------------

	
	@RequestMapping("cadastrotarefa")
	public String cadastro() {
		return "cadastrotarefa";
	}
	
	
	@RequestMapping(value = "salvartarefa", method = RequestMethod.GET)
	public String salvarTarefa(Tarefas tarefas) {
		repository.save(tarefas);
		return "sucesso";
	}

    //Buscar dados-----------------------------------------------	

	@RequestMapping("listarTarefa")
	public ModelAndView listaTarefa() {
		ModelAndView view = new ModelAndView("listasTarefas");
		Iterable<Tarefas> tarefas = repository.findAll();
		view.addObject("tarefasss", tarefas);
		return view;
	}
	
	
}
