package kodlamaio.hrms.business.abstracts;

import java.util.*;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerEducation;

public interface JobSeekerEducationService {

	Result add(JobSeekerEducation education);
	
	DataResult<List<JobSeekerEducation>> getAllSortedByJobSeekerId(int id);
}
