package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.mapper.MapperService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CurriculumVitaeRepository;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerRepository;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.CvGetDto;

@Service
public class CurriculumVitaeServiceImpl implements CurriculumVitaeService{

	private CurriculumVitaeRepository repository;
	private JobSeekerRepository jobSeekerRepository;
	private MapperService mapperService;
	
	@Autowired
	public CurriculumVitaeServiceImpl(CurriculumVitaeRepository repository, 
									  JobSeekerRepository jobSeekerRepository,
									  MapperService mapperService) {
		super();
		this.repository = repository;
		this.jobSeekerRepository = jobSeekerRepository;
		this.mapperService = mapperService;
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.repository.save(curriculumVitae);
		return new SuccessResult("CV eklendi");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(int id) {
		
		JobSeeker jobSeeker = this.jobSeekerRepository.getByJobSeekerId(id);
		System.out.println(jobSeeker.getJobSeekerEducations());
		return new SuccessDataResult<List<CurriculumVitae>>(this.repository.getByJobSeeker_JobSeekerId(id),
															"CV'ler getirildi");
	}

	@Override
	public DataResult<CurriculumVitae> getByCurriculumVitaeId(int id) {
		//System.out.println(this.repository.getByCurriculumVitaeId(id).getJobSeeker());
		return null;
				//new SuccessDataResult<CurriculumVitae>(this.repository.getByCurriculumVitaeId(id), "Cv getirildi");
	}

	@Override
	public DataResult<List<CvGetDto>> getCv(int cvId) {
		
		return new SuccessDataResult<List<CvGetDto>>(mapperService.mapList(this.repository.getByCurriculumVitaeId(cvId), CvGetDto.class), "Cv bilgileri getirildi");
	}

}
