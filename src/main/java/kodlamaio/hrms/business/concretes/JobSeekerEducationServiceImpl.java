package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerEducationRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerEducation;

@Service
public class JobSeekerEducationServiceImpl implements JobSeekerEducationService{

	private JobSeekerEducationRepository repository;

	@Autowired
	public JobSeekerEducationServiceImpl(JobSeekerEducationRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerEducation education) {
		this.repository.save(education);
		return new SuccessResult("Eğitim eklendi");
	}

	//In order to sort the end years to come first which has null value, I used Sort.NullHandling.NULLS_FIRST
	@Override
	public DataResult<List<JobSeekerEducation>> getAllSortedByJobSeekerId(int jobSeekerId) {
		Sort sort = Sort.by(new Sort.Order(Sort.Direction.DESC, "endYear", Sort.NullHandling.NULLS_FIRST));
		
		return new SuccessDataResult<List<JobSeekerEducation>>
			(this.repository.findByJobSeeker_JobSeekerId(jobSeekerId, sort), "Azalan sıralandı");		
	}
	
	
}
