package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerSocialAccountService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerSocialAccountRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerSocialAccount;
import kodlamaio.hrms.entities.dtos.JobSeekerSocialAccountWithSocialAccountTypeDto;

@Service
public class JobSeekerSocialAccountManager implements JobSeekerSocialAccountService{

	private JobSeekerSocialAccountRepository repository;
	
	@Autowired
	public JobSeekerSocialAccountManager(JobSeekerSocialAccountRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerSocialAccount account) {
		this.repository.save(account);	
		
		return new SuccessResult(" Sosyal Medya Hesabı girildi");
	}

	@Override
	public DataResult<List<JobSeekerSocialAccount>> getAll() {
		
		return new SuccessDataResult<List<JobSeekerSocialAccount>>(this.repository.findAll(), "Liste getirildi");
	}

	@Override
	public DataResult<List<JobSeekerSocialAccountWithSocialAccountTypeDto>> getJobSeekerSocialAccountsWithDetails() {
		return new SuccessDataResult<List<JobSeekerSocialAccountWithSocialAccountTypeDto>>(this.repository.getJobSeekerSocialAccountsWithDetails(), "başarılı");
	}

}
