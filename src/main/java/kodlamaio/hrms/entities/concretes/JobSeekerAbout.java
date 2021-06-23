package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobseekerabout")
public class JobSeekerAbout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseekerabout_id")
	private int jobSeekerAbout_id;
	
	@Column(name = "about", nullable = false)
	private String about;
	
	@OneToOne(mappedBy = "jobSeekerAbout")
	@JsonBackReference
	private JobSeeker jobSeeker;
}
