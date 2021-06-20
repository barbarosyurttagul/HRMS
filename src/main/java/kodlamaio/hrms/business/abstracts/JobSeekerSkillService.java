package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSkill;

public interface JobSeekerSkillService {

	Result add(JobSeekerSkill skill);
}
