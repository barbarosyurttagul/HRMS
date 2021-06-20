package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerAboutService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerAboutRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerAbout;

@Service
public class JobSeekerAboutManager implements JobSeekerAboutService{

	private JobSeekerAboutRepository repository;
	
	@Autowired
	public JobSeekerAboutManager(JobSeekerAboutRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerAbout jobSeekerAbout) {
		this.repository.save(jobSeekerAbout);
		return new SuccessResult("Önsöz bölümü girildi");
	}

}
