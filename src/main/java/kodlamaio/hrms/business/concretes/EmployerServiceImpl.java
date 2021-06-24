package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.AccountActivation;
import kodlamaio.hrms.core.Utility;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerRepository;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerServiceImpl implements EmployerService{

	private EmployerRepository employerRepository;
	
	@Autowired
	public EmployerServiceImpl(EmployerRepository employerRepository) {
		super();
		this.employerRepository = employerRepository;
	}

	
	@Override
	public Result register(Employer employer) {
		
		if(!Utility.validateEmail(employer.getEmail())) 
			return new ErrorResult("Geçerli bir email girmediniz");
		
		if(!emailAndWebUrlMatches(employer.getEmail(), employer.getWebUrl()))
			return new ErrorResult("Email ile Web adresiniz uyumlu değil");
		
		if(!emailExists(employer.getEmail())) 
			return new ErrorResult("Bu email ile daha önce kaydolunmuş");
			
		if(!employer.getCompanyName().isEmpty() &&
		   !employer.getWebUrl().isEmpty() &&
		   !employer.getEmail().isEmpty() &&
		   !employer.getPhone().isEmpty() &&
		   !employer.getPassword().isEmpty()) {
				
				employer.setVerifiedByEmail(false);
				employer.setVerifiedBySystemUser(false);
				AccountActivation.verifyByEmail(employer.getEmail());
				this.employerRepository.save(employer);
				return new SuccessResult("Şirket eklendi");
			}
		
			return new ErrorResult("Bilgilerde hata var");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerRepository.findAll(), "İşverenler listelendi");
	}
	
	public Result activateAccountBySystemUser(int id) {
		Employer employer = employerRepository.getOne(id);
		employer.setVerifiedBySystemUser(true);
		this.employerRepository.save(employer);
		return new SuccessResult("İşveren Sistem Kullanıcısı tarafından doğrulandı");
	}
		
	private Boolean emailAndWebUrlMatches(String email, String webUrl) {
		String[] emailSplit = email.split("@");
		
		if(webUrl.contains(emailSplit[1])) {
			return true;
		}
		return false;
	}
	
	private Boolean emailExists(String email) {
		if(employerRepository.getByEmail(email) == null)
			return true;
		return false;
	}

}
