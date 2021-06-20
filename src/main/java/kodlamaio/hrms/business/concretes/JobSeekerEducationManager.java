package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerEducationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerEducationRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerEducation;

@Service
public class JobSeekerEducationManager implements JobSeekerEducationService{

	private JobSeekerEducationRepository repository;

	@Autowired
	public JobSeekerEducationManager(JobSeekerEducationRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerEducation education) {
		this.repository.save(education);
		return new SuccessResult("Eğitim eklendi");
	}
	
	
}
