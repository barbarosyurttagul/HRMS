package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Job;

@RequestMapping("/api/jobs/")
@RestController
public class JobsController {

	private JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Job>> getAll() {
		return this.jobService.getAll();
	}
	
	@GetMapping("getAllValidJobs")
	public DataResult<List<Job>> getAllValidJobs(){
		return this.jobService.getAllValidJobs();
	}
	
	@GetMapping("getAllValidJobsSortedByReleaseDate")
	public DataResult<List<Job>> getAllValidJobsSortedByReleaseDate(){
		return this.jobService.getAllValidJobsSortedByReleaseDate();
	}
	
	@GetMapping("getByValidTrueAndEmployerId")
	public DataResult<List<Job>> getByValidTrueAndEmployerId(int employerId){
		return this.jobService.getByValidTrueAndEmployerId(employerId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	
	@PostMapping("changeStateOfJob")
	public Result changeStateOfJob(@RequestBody int jobId, Boolean state) {
		return this.jobService.changeStateOfJob(jobId, state);
	}
}
