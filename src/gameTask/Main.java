package gameTask;

import gameTask.Adapters.MernisServiceAdapter;
import gameTask.Concrete.CampaignManager;
import gameTask.Concrete.SaleManager;
import gameTask.Concrete.UserManager;
import gameTask.Entities.Campaign;
import gameTask.Entities.Game;
import gameTask.Entities.User;

public class Main {
//Bilgehan EROÐLU
	public static void main(String[] args) {
		System.out.println("------------------------KULLANICI ÝÞLEMLERÝ------------------------");
		User user = new User(1,"Bilgehan", "Eroðlu", 1999, "12345678910");
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.signUp(user);
		userManager.delete(user);
		userManager.info(user);
		
		
		System.out.println("------------------------KAMPANYA ÝÞLEMLERÝ------------------------");
		Game game = new Game();
		game.setGameName("Age of Empires 2");
		game.setId(1);
		game.setCategory("Strateji");

		Campaign campaign=new Campaign();
		campaign.setCampaignId(1);
		campaign.setDiscountRate(40);
		campaign.setPrice(20);
		campaign.getFinalPrice();
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign,game);
		campaignManager.updateCampaign(campaign, game);
		campaignManager.deleteCampaign(campaign, game);
		
		
		System.out.println("------------------------SATIÞ------------------------");
		SaleManager saleManager= new SaleManager();
		saleManager.sepet(campaign);
		saleManager.satis(user, game);
		

		

	}

}
