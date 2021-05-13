package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "systemUsers")
public class SystemUser {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private Boolean verifiedByEmail;
	
	public SystemUser() {}

	public SystemUser(int userId, String firstName, String lastName, String email, 
			String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	
}
