package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleRepository;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	
	private JobTitleRepository jobTitleRepository;
	
	@Autowired
	public JobTitleManager(JobTitleRepository jobTitleRepository) {
		super();
		this.jobTitleRepository = jobTitleRepository;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleRepository.findAll(), "Ürünler Listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		if(jobTitleExists(jobTitle.getTitle()))
			return new ErrorResult("Bu iş unvanı daha önce eklenmiş");
		
		this.jobTitleRepository.save(jobTitle);
		return new SuccessResult("Yeni Unvan Eklendi");
	}
	
	private Boolean jobTitleExists(String title) {
		if(jobTitleRepository.getByTitle(title) != null)
			return true;
		return false;
	}

}
