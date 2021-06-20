package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobseekerexperiences")
public class JobSeekerExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseekerexperience_id")
	private int jobSeekerExperience_id;
	
	@Column(nullable = false)
	private String company;
	
	@Column(nullable = false)
	private String position;
	
	@Column(name = "startyear", nullable = false)
	private int startYear;
	
	@Column(name = "endyear")
	private int endYear;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
	
	
}
