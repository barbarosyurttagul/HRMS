package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{
	List<Job> getByValidTrue();
	
	List<Job> getByValidTrueOrderByReleaseDate();
	
	List<Job> getByValidTrueAndEmployer_EmployerId(int employerId);
}
