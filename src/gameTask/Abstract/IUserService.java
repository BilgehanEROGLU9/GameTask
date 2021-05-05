package gameTask.Abstract;

import gameTask.Entities.User;

public interface IUserService {
	void update(User user);
	void delete(User user);
	void signUp(User user);
	void info(User user);

}
