package gameTask.Concrete;

import gameTask.Abstract.ISaleService;
import gameTask.Entities.Campaign;
import gameTask.Entities.Game;
import gameTask.Entities.User;

public class SaleManager implements ISaleService{

	@Override
	public void satis(User user,Game game) {
		System.out.println(game.getGameName()+" ba�ar�yla sat�n al�nd�. Sat�n al�m�n i�in te�ekk�rler "+user.getFirstName()+"!");
		
	}

	@Override
	public void sepet(Campaign campaign) {
		System.out.println("�r�n sepete eklendi. �ndirimsiz fiyat : "+campaign.getPrice()+"TL ---> �ndirimli Fiyat : "+campaign.getFinalPrice()+"TL");
	}

}
