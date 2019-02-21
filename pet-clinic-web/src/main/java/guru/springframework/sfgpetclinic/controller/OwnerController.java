package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService service;

	public OwnerController(OwnerService service) {
		super();
		this.service = service;
	}

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners", service.findAll());
		return "owners/index";
	}
}
