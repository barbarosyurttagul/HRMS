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
	
	//Since the sorting gives null error for null columns, I used a non-primitive wrapper type (Integer instead of int)
		//https://stackoverflow.com/questions/3154582/why-do-i-get-a-null-value-was-assigned-to-a-property-of-primitive-type-setter-o
	@Column(name = "endyear")
	private Integer endYear;
	
	@ManyToOne()
	@JsonBackReference
	@JoinColumn(name = "jobseeker_id")
	@ToString.Exclude
	private JobSeeker jobSeeker;
	
}
