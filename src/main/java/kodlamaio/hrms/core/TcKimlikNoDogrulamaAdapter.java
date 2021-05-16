package kodlamaio.hrms.core;


import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class TcKimlikNoDogrulamaAdapter implements TcKimlikNoDogrulamaService{

	@Override
	public boolean TcKimlikNoDogrula(long TcNo, String firstName, String lastName, int birthYear) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(TcNo, firstName, lastName, birthYear);
			return result;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

	

	
	
}
