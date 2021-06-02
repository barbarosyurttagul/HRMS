package kodlamaio.hrms.core;

import Mernis.MernisManager;

public class MernisManagerAdapter {
	
	public static void verifyNationalIdentity(long natIdentity, int birthYear, String firstName, String lastName) {
		//normal şartlarda boolean dönen bir metod yapacağız. Bu bir fake service dir.
		MernisManager mernisManager = new MernisManager();
		mernisManager.tcKimlikNoDogrula(natIdentity, birthYear, firstName, lastName);
	}

}
