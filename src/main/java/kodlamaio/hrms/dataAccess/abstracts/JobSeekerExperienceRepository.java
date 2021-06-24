package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceRepository extends JpaRepository<JobSeekerExperience, Integer>{

	//https://www.baeldung.com/spring-data-sorting
	List<JobSeekerExperience> findByJobSeeker_JobSeekerId(int id, Sort sort);
}
