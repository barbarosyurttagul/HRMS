package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerPictureService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerPictureRepository;
import kodlamaio.hrms.entities.concretes.JobSeekerPicture;

@Service
public class JobSeekerPictureImpl implements JobSeekerPictureService{

	private JobSeekerPictureRepository repository;
	
	@Autowired
	public JobSeekerPictureImpl(JobSeekerPictureRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Result add(JobSeekerPicture picture) {
		this.repository.save(picture);
		return new SuccessResult("Resim Girişi başarılı");
	}

}
