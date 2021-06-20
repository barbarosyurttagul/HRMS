package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerAboutService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerAbout;

@RequestMapping("/api/jobseekerabout/")
@RestController
public class JobSeekerAboutsController {

	private JobSeekerAboutService service;

	@Autowired
	public JobSeekerAboutsController(JobSeekerAboutService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerAbout about) {
		return this.service.add(about);
	}
}
