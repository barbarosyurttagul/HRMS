package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.TcKimlikNoDogrulamaService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private TcKimlikNoDogrulamaService service;
	
	@Autowired
	public JobSeekerManager(TcKimlikNoDogrulamaService service) {
		super();
		this.service = service;
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobSeeker> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyJobSeekerNationalIdentity(JobSeeker jobSeeker) {
				
		return service.TcKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalIdentity()), jobSeeker.getFirstName(), jobSeeker.getLastName(), Integer.parseInt(jobSeeker.getBirthYear()));
	}

}
