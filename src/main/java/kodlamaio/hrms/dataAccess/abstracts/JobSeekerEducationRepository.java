package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerEducation;

public interface JobSeekerEducationRepository extends JpaRepository<JobSeekerEducation, Integer>{

	//https://www.baeldung.com/spring-data-sorting
		List<JobSeekerEducation> findByJobSeeker_JobSeekerId(int id, Sort sort);
}
