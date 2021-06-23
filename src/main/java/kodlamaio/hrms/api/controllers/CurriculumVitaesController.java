package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CvGetDto;

@RequestMapping("/api/curriculumvitaes/")
@RestController
public class CurriculumVitaesController {

	private CurriculumVitaeService curriculumVitaeService;
	
	public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		return this.curriculumVitaeService.add(curriculumVitae);
	}
	
	@GetMapping("getbyjobseekerid")
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(@RequestParam int jobSeekerId) {
		return this.curriculumVitaeService.getByJobSeekerId(jobSeekerId);
	}
	
	@GetMapping("getbycurriculumvitaeid")
	public DataResult<CurriculumVitae> getByCurriculumVitaeId(int id) {
		return this.curriculumVitaeService.getByCurriculumVitaeId(id);
	}
	
	@GetMapping("getcv")
	public DataResult<List<CvGetDto>> getCv(int cvId) {
		return this.curriculumVitaeService.getCv(cvId);
	}
}
