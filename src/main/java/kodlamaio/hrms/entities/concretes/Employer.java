package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String companyName;
	
	private String webUrl;
	
	private String phone;
	
	private String email;
	
	private String password;
	
	private Boolean verifiedByEmail;
	
	public Employer() {}

	public Employer(String companyName, String webUrl, String phone, String email, 
			String password, Boolean verifiedByEmail) {
		super();
		this.companyName = companyName;
		this.webUrl = webUrl;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.verifiedByEmail = verifiedByEmail;
	}
	
}
