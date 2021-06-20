package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerSkillService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerSkillRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerSkill;

@Service
public class JobSeekerSkillManager implements JobSeekerSkillService{

	private JobSeekerSkillRepository repository;
	
	@Autowired
	public JobSeekerSkillManager(JobSeekerSkillRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerSkill skill) {
		this.repository.save(skill);
		return new SuccessResult("Yetenek girildi");
	}

}
