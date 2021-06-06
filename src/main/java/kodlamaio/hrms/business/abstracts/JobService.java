package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job); 
	
	DataResult<List<Job>> getAll();
	
	DataResult<List<Job>> getAllValidJobs();
	
	DataResult<List<Job>> getAllValidJobsSortedByReleaseDate();
	
	DataResult<List<Job>> getByValidTrueAndEmployerId(int employerId);
	
	Result changeStateOfJob(int jobId, Boolean state);
}
