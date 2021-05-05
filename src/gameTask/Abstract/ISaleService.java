package gameTask.Abstract;


import gameTask.Entities.Campaign;
import gameTask.Entities.Game;
import gameTask.Entities.User;

public interface ISaleService {
	void sepet(Campaign campaign);
	void satis(User user,Game game);
	
}
