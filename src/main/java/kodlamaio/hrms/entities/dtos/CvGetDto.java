package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobSeekerAbout;
import kodlamaio.hrms.entities.concretes.JobSeekerEducation;
import kodlamaio.hrms.entities.concretes.JobSeekerExperience;
import kodlamaio.hrms.entities.concretes.JobSeekerForeignLanguage;
import kodlamaio.hrms.entities.concretes.JobSeekerPicture;
import kodlamaio.hrms.entities.concretes.JobSeekerSkill;
import kodlamaio.hrms.entities.concretes.JobSeekerSocialAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvGetDto {

	
	private int jobSeekerId;
	
	private String jobSeekerFirstName;

	private String jobSeekerLastName;
	
	List<JobSeekerExperience> jobSeekerExperiences;
		
	List<JobSeekerEducation> jobSeekerEducations;
	
	List<JobSeekerForeignLanguage> jobSeekerForeignLanguages;
	
	List<JobSeekerSkill> jobSeekerSkills;
	
	List<JobSeekerSocialAccount> jobSeekerSocialAccounts;
	
	private JobSeekerAbout jobSeekerAbout;
	
	private JobSeekerPicture jobSeekerPicture;
}
