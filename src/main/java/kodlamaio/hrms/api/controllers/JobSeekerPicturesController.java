package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerPictureService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerPicture;

@RequestMapping("/api/jobseekerpictures/")
@RestController
public class JobSeekerPicturesController {

	private JobSeekerPictureService service;

	@Autowired
	public JobSeekerPicturesController(JobSeekerPictureService service) {
		super();
		this.service = service;
	}
	
	public Result add(@RequestBody JobSeekerPicture picture) {
		return this.service.add(picture);
	}
	
	
	
}
