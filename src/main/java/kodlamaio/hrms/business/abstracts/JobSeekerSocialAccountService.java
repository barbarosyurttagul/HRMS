package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSocialAccount;
import kodlamaio.hrms.entities.dtos.JobSeekerSocialAccountWithSocialAccountTypeDto;

public interface JobSeekerSocialAccountService {

	Result add(JobSeekerSocialAccount account);
	
	DataResult<List<JobSeekerSocialAccount>> getAll();
	
	DataResult<List<JobSeekerSocialAccountWithSocialAccountTypeDto>> getJobSeekerSocialAccountsWithDetails();
}
