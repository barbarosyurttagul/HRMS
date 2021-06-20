package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerSkillService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSkill;

@RequestMapping("/api/jobseekerskills/")
@RestController
public class JobSeekerSkillsController {

	private JobSeekerSkillService service;

	@Autowired
	public JobSeekerSkillsController(JobSeekerSkillService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerSkill skill) {
		return this.service.add(skill);
	}
}
