package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceService {

	Result add(JobSeekerExperience experience);
}
