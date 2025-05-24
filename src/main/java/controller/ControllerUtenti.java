package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entita.Utente;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import repository.UtenteRepository;


@Controller
@RequestMapping("/utenti")
public class ControllerUtenti {

	//marcatore per poter usare la repo dentro il controller
		@Autowired 
		private UtenteRepository repository;
		
	@GetMapping
	
	public String index(Model model) {
		model.addAttribute("lista_utenti", repository.findAll());
		return "utenti/index";
	}
	
	@GetMapping("/create")
	
	public String create(Model model) {
		
		model.addAttribute("nuovo_utente", new Utente());
		return "utenti/registrazione";
	}
	
	
	@PostMapping("/create")
	
	public String store(@Valid @ModelAttribute("nuovo_utente") Utente nuovoUtente,
			BindingResult bindingResult,
			Model model) {
		if(bindingResult.hasErrors()){
			
			System.out.println(bindingResult.toString());
			return "utenti/registrazione";
			
			} 
		
		repository.save(nuovoUtente);
		return "redirect:/";
	}
	
	
	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession sessione, Model model) {
		System.out.println(email);
		System.out.println(password);
		return repository.findByEmailAndPassword(email, password)
                .map(utente -> {
                    sessione.setAttribute("utente_loggato", utente);
                    return "redirect:/";
                })
                .orElseGet(() -> {
                    model.addAttribute("error", "Credenziali non valide");
                    return "utenti/form_login";
                });
	}
	
	@GetMapping("/login")
	public String form_login() {
		System.out.println("entro nel form_login");
		
		return "utenti/form_login";
	}
}
