package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerExperienceService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerExperienceRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerExperience;

@Service
public class JobSeekerExperienceManager implements JobSeekerExperienceService {

	private JobSeekerExperienceRepository repository;
	
	@Autowired
	public JobSeekerExperienceManager(JobSeekerExperienceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerExperience experience) {
		this.repository.save(experience);
		return new SuccessResult("İş tecrübesi girildi");
	}

}
