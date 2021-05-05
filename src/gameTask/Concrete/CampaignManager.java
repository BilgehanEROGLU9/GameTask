package gameTask.Concrete;

import gameTask.Abstract.ICampaignService;
import gameTask.Entities.Campaign;
import gameTask.Entities.Game;




public class CampaignManager implements ICampaignService {



	@Override
	public void updateCampaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" oyununun kampanyas� g�ncellendi, yeni indirim oran� : %"+campaign.getDiscountRate()+"  yeni fiyat : "+campaign.getFinalPrice());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" oyununun kampanyas� silindi, yeni fiyat : "+campaign.getPrice());
	}

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" oyununa %"+campaign.getDiscountRate()+" indirim kampanyas� uyguland�, yeni fiyat : "+campaign.getFinalPrice());
		
	}





}
