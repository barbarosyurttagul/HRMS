package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "jobseekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jobseeker_id")
	private int jobSeekerId;
	
	@Column(name="firstname", nullable = false)
	private String firstName;
	
	@Column(name="lastname", nullable = false)
	private String lastName;
	
	@Column(name="nationalidentity", nullable = false)
	private String nationalIdentity;
	
	@Column(name="birthyear", nullable = false)
	private String birthYear;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="verifiedbyemail", nullable = false)
	private Boolean verifiedByEmail;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<JobSeekerEducation> jobSeekerEducations;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<JobSeekerExperience> jobSeekerExperiences;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<JobSeekerForeignLanguage> jobSeekerForeignLanguages;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<JobSeekerSkill> jobSeekerSkills;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<JobSeekerSocialAccount> jobSeekerSocialAccounts;
	
	@OneToMany(mappedBy = "jobSeeker")
	@JsonIgnore
	@JsonManagedReference
	private List<CurriculumVitae> curriculumVitaes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "picture_id", referencedColumnName = "jobseekerpicture_id")
	@JsonBackReference
	private JobSeekerPicture jobSeekerPicture;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "about_id", referencedColumnName = "jobseekerabout_id")
	@JsonBackReference
	private JobSeekerAbout jobSeekerAbout;

}
