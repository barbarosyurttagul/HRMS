package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

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
@Table(name = "jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private int job_id;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "minsalary")
	private int minSalary;
	
	@Column(name = "maxsalary")
	private int maxSalary;
	
	@Column(name = "vacantposition", nullable = false)
	private int vacantPosition;
	
	@Column(name = "deadline", nullable = false)
	private LocalDateTime deadline;
	
	@Column(name = "releasedate", nullable = false)
	private LocalDateTime releaseDate;
	
	@Column(name = "valid", nullable = false)
	private Boolean valid;
	
	@ManyToOne()
	@JoinColumn(name = "jobtitle_id")
	private JobTitle jobTitle;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	
}
