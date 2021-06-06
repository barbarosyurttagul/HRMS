package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

@RequestMapping("/api/employers")
@RestController
public class EmployersController {

	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public Result getAll() {
		return this.employerService.getAll();
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody Employer employer) {
		return this.employerService.register(employer);
	}
	
	@PostMapping("/activate")
	public Result activateAccountBySystemUser(@RequestBody int id) {
		return this.employerService.activateAccountBySystemUser(id);
	}
}
