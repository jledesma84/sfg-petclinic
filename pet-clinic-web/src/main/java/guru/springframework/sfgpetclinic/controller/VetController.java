package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {

	private final VetService service;
	
	public VetController(VetService service) {
		super();
		this.service = service;
	}

	@RequestMapping({"", "/","/index","/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", service.findAll());
		return "vets/index";
	}
}
