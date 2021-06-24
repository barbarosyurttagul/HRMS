package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobRepository;
import kodlamaio.hrms.entities.concretes.Job;

@Service
public class JobServiceImpl implements JobService{

	private JobRepository jobRepository;
	
	@Autowired
	public JobServiceImpl(JobRepository jobRepository) {
		super();
		this.jobRepository = jobRepository;
	}

	@Override
	public Result add(Job job) {
		
		this.jobRepository.save(job);
		return new SuccessResult("İş İlanı başarıyla girildi");
	}

	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>(this.jobRepository.findAll(), "İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<Job>> getAllValidJobs() {
		
		return new SuccessDataResult<List<Job>>(this.jobRepository.getByValidTrue(), "İş İlanları Listelendi");
	}
	
	@Override
	public DataResult<List<Job>> getAllValidJobsSortedByReleaseDate() {
		
		//Sort sort = Sort.by(Sort.Direction.ASC, "releaseDate");
		
		return new SuccessDataResult<List<Job>>(this.jobRepository.getByValidTrueOrderByReleaseDate(), "Sıralama yapıldı");
	}

	@Override
	public DataResult<List<Job>> getByValidTrueAndEmployerId(int employerId) {
		return new SuccessDataResult<List<Job>>(this.jobRepository.getByValidTrueAndEmployer_EmployerId(employerId), "Firmaya göre aktif ilanlar listelendi");
	}

	@Override
	public Result changeStateOfJob(int jobId, Boolean state) {
		Job job = this.jobRepository.findById(jobId).get();
		job.setValid(state);
		this.jobRepository.save(job);
		return new SuccessResult("İş ilanı durumu değiştirildi");
		
	}

}
