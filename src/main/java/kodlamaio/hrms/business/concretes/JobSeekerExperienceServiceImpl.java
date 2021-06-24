package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerExperienceRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerExperience;

@Service
public class JobSeekerExperienceServiceImpl implements JobSeekerExperienceService {

	private JobSeekerExperienceRepository repository;
	
	@Autowired
	public JobSeekerExperienceServiceImpl(JobSeekerExperienceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerExperience experience) {
		this.repository.save(experience);
		return new SuccessResult("İş tecrübesi girildi");
	}

	//In order to sort the end years to come first which has null value, I used Sort.NullHandling.NULLS_FIRST
	@Override
	public DataResult<List<JobSeekerExperience>> getAllSortedByJobSeekerId(int id) {
		Sort sort = Sort.by(new Sort.Order(Sort.Direction.DESC, "endYear", Sort.NullHandling.NULLS_FIRST));
		
		return new SuccessDataResult<List<JobSeekerExperience>>
			(this.repository.findByJobSeeker_JobSeekerId(id, sort), "Azalan sıralandı");
	}

}
