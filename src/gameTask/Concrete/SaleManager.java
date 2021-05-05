package gameTask.Concrete;

import gameTask.Abstract.ISaleService;
import gameTask.Entities.Campaign;
import gameTask.Entities.Game;
import gameTask.Entities.User;

public class SaleManager implements ISaleService{

	@Override
	public void satis(User user,Game game) {
		System.out.println(game.getGameName()+" baþarýyla satýn alýndý. Satýn alýmýn için teþekkürler "+user.getFirstName()+"!");
		
	}

	@Override
	public void sepet(Campaign campaign) {
		System.out.println("Ürün sepete eklendi. Ýndirimsiz fiyat : "+campaign.getPrice()+"TL ---> Ýndirimli Fiyat : "+campaign.getFinalPrice()+"TL");
	}

}
