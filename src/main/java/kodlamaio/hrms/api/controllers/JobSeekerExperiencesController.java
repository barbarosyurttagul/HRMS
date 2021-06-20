package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerExperienceService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerExperience;

@RequestMapping("/api/jobseekerexperiences/")
@RestController
public class JobSeekerExperiencesController {

	private JobSeekerExperienceService service;

	@Autowired
	public JobSeekerExperiencesController(JobSeekerExperienceService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerExperience experience) {
		return this.service.add(experience);
	}
	
}
