package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobSeekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String nationalIdentity;
	
	private String birthYear;
	
	private String email;
	
	private String password;
	
	private Boolean verifiedByEmail;
	
	public JobSeeker() {}

	public JobSeeker(String firstName, String lastName, String nationalIdentity, String birthYear, String email,
			String password, Boolean verifiedByEmail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.email = email;
		this.password = password;
		this.verifiedByEmail = verifiedByEmail;
	}
}
