package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerEducationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerEducation;

@RequestMapping("/api/jobseekereducations/")
@RestController
public class JobSeekerEducationsController {

	private JobSeekerEducationService service;

	@Autowired
	public JobSeekerEducationsController(JobSeekerEducationService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerEducation education) {
		return this.service.add(education);
	}
	
}
