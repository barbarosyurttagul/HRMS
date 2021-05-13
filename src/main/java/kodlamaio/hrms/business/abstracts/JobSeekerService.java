package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
void add(JobSeeker jobSeeker);
	
	List<JobSeeker> getAll();

}
