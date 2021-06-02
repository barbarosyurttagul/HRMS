package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.AccountActivation;
import kodlamaio.hrms.core.MernisManagerAdapter;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerRepository;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerRepository jobSeeekerRepository;
	
	@Autowired
	public JobSeekerManager(JobSeekerRepository jobSeeekerRepository) {
		super();
		this.jobSeeekerRepository = jobSeeekerRepository;
	}


	@Override
	public Result add(JobSeeker jobSeeker) {
		System.out.println("Şifre ve şifre tekrarı kontrolü yapıldı");
		MernisManagerAdapter.verifyNationalIdentity(Long.parseLong(jobSeeker.getNationalIdentity()), Integer.parseInt(jobSeeker.getBirthYear()), jobSeeker.getFirstName(), jobSeeker.getLastName());
		
		if (jobSeeker.getFirstName() != null && 
			jobSeeker.getLastName() != null &&
			jobSeeker.getNationalIdentity() != null &&
			jobSeeker.getBirthYear() != null &&
			jobSeeker.getEmail() != null &&
			jobSeeker.getPassword() != null &&
			emailExists(jobSeeker.getEmail()) &&
			nationalIdentityExists(jobSeeker.getNationalIdentity()) ){
			jobSeeker.setVerifiedByEmail(false);
			AccountActivation.verifyByEmail(jobSeeker.getEmail());
			this.jobSeeekerRepository.save(jobSeeker);
			return new SuccessResult("Şifre ve şifre tekrarı kontrolü yapıldı. TcNo Doğrulaması Yapıldı. Aktivasyon Emaili gönderildi. İş Arayan Eklendi");
		}
		
		else {
			return new ErrorResult("Girilen bilgilerde eksiklik var");
		}		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeeekerRepository.findAll(), "İş Arayanlar Listelendi");
	}
	
	private Boolean emailExists(String email) {
		
		if(this.jobSeeekerRepository.getByEmail(email) == null) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	private Boolean nationalIdentityExists(String nationalIdentity) {
		
		if(this.jobSeeekerRepository.getByEmail(nationalIdentity) == null) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
