package gameTask.Adapters;

import java.rmi.RemoteException;

import gameTask.Abstract.IUserCheckService;
import gameTask.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {

			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			boolean kontrol = false;
			try {
				return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalIdentity()), user.getFirstName().toUpperCase(),
						user.getLastName().toUpperCase(), user.getDateOfBirth());
			} catch (NumberFormatException | RemoteException e) {
				e.printStackTrace();
			}
			return kontrol;

	}

}
