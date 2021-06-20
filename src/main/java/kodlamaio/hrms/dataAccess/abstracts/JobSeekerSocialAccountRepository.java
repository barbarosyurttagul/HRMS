package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobSeekerSocialAccount;
import kodlamaio.hrms.entities.dtos.JobSeekerSocialAccountWithSocialAccountTypeDto;

public interface JobSeekerSocialAccountRepository extends JpaRepository<JobSeekerSocialAccount, Integer>{

	@Query("Select new kodlamaio.hrms.entities.dtos.JobSeekerSocialAccountWithSocialAccountTypeDto"
			+ "(j.id, j.jobSeeker.firstName, j.socialAccountUrl, s.socialAccountTypeName)"
			+ "from SocialAccountType s inner join  s.jobSeekerSocialAccounts j")
	List<JobSeekerSocialAccountWithSocialAccountTypeDto> getJobSeekerSocialAccountsWithDetails();

}

