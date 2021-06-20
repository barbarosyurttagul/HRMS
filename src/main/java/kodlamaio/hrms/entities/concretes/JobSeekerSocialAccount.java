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
@Table(name = "jobseekersocialaccounts")
public class JobSeekerSocialAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseekersocialaccount_id")
	private int jobSeekerSocialAccount_id;
	
	@Column(name = "socialaccounturl")
	private String socialAccountUrl;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne()
	@JoinColumn(name = "socialaccounttype_id")
	private SocialAccountType socialAccountType;
	
}
