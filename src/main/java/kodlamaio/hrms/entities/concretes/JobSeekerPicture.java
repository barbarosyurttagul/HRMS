package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobseekerpicture")
public class JobSeekerPicture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseekerpicture_id")
	private int jobSeekerPicture_id;
	
	@Column(name = "pictureurl", nullable = false)
	private String pictureUrl;
		
	@OneToOne(mappedBy = "jobSeekerPicture")	
	private JobSeeker jobSeeker;
}
