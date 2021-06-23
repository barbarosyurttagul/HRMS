package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CurriculumVitae;


public interface CurriculumVitaeRepository extends JpaRepository<CurriculumVitae, Integer>{

	List<CurriculumVitae> getByJobSeeker_JobSeekerId(int id);
	
	List<CurriculumVitae> getByCurriculumVitaeId(int id);
	
	
}
