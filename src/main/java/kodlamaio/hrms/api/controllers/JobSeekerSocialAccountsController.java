package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerSocialAccountService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSocialAccount;
import kodlamaio.hrms.entities.dtos.JobSeekerSocialAccountWithSocialAccountTypeDto;

@RequestMapping("/api/jobseekersocialaccounts/")
@RestController
public class JobSeekerSocialAccountsController {

	private JobSeekerSocialAccountService service;

	@Autowired
	public JobSeekerSocialAccountsController(JobSeekerSocialAccountService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerSocialAccount account) {
		return this.service.add(account);
	}
	
	@GetMapping("getall")
	public DataResult <List<JobSeekerSocialAccount>> getAll() {
		return this.service.getAll();
	}
	
	@GetMapping("getjobseekersocialaccountswithdetails")
	public DataResult<List<JobSeekerSocialAccountWithSocialAccountTypeDto>> getJobSeekerSocialAccountsWithDetails() {
		return this.service.getJobSeekerSocialAccountsWithDetails();
	}
}
