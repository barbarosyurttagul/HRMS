package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerForeignLanguageRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;

@Service
public class JobSeekerForeignLanguageServiceImpl implements JobSeekerForeignLanguageService {

	private JobSeekerForeignLanguageRepository repository;
	
	@Autowired
	public JobSeekerForeignLanguageServiceImpl(JobSeekerForeignLanguageRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerForeignLanguage language) {
		this.repository.save(language);
		return new SuccessResult("Yabancı Dil Girişi yapıldı");
	}

}
