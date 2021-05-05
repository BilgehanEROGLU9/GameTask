package gameTask.Concrete;

import gameTask.Abstract.IUserCheckService;
import gameTask.Entities.User;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return true;
	}

}
