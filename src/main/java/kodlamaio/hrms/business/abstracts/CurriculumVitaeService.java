package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CvGetDto;

public interface CurriculumVitaeService {

	Result add(CurriculumVitae curriculumVitae);
	
	DataResult<List<CurriculumVitae>> getByJobSeekerId(int id);
	
	DataResult<CurriculumVitae> getByCurriculumVitaeId(int id);
	
	DataResult<List<CvGetDto>> getCv(int cvID);
}
