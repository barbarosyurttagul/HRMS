package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobtitles")
public class JobTitle {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	
	public JobTitle() {}

	public JobTitle(String title) {
		super();
		this.title = title;
	}
}

