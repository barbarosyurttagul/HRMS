package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;

@RequestMapping("/api/jobseekerforeignlanguages/")
@RestController
public class JobSeekerForeignLanguagesController {

	private JobSeekerForeignLanguageService service;

	@Autowired
	public JobSeekerForeignLanguagesController(JobSeekerForeignLanguageService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerForeignLanguage language) {
		return this.service.add(language);
	}
}
