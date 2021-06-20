package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerPicture;

public interface JobSeekerPictureRepository extends JpaRepository<JobSeekerPicture, Integer> {

}
