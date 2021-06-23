package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobseekereducations")
public class JobSeekerEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int education_id;
	
	@Column(nullable = false)
	private String school;
	
	@Column(name = "fieldofstudy", nullable = false)
	private String fieldOfStudy;
	
	@Column(name = "startyear", nullable = false)
	private int startYear;
	
	@Column(name = "endyear")
	private int endYear;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	@JsonBackReference
	@ToString.Exclude
	private JobSeeker jobSeeker;

}
