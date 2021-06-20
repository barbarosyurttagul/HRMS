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
@Table(name = "jobseekerforeignlanguages")
public class JobSeekerForeignLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseekerforeignlanguage_id")
	private int jobSeekerForeignLanguage_id;
	
	@Column(nullable = false)
	private String language;
	
	@Column(nullable = false)
	private int level;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
}
