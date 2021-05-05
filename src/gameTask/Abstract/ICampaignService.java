package gameTask.Abstract;
import gameTask.Entities.Campaign;
import gameTask.Entities.Game;


public interface ICampaignService {
	void updateCampaign(Campaign campaign,Game game);
	void deleteCampaign(Campaign campaign,Game game);
	void addCampaign(Campaign campaign,Game game);

}
