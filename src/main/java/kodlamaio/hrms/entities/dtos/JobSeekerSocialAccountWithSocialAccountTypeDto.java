package kodlamaio.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerSocialAccountWithSocialAccountTypeDto {

	private int id;
	private String jobSeekerFirstName;
	private String socialAccountUrl;
	private String socialAccountTypeName;
}
