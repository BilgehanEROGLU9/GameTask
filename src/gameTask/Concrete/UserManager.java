package gameTask.Concrete;

import gameTask.Abstract.IUserCheckService;
import gameTask.Abstract.IUserService;
import gameTask.Entities.User;

public class UserManager implements IUserService {

	IUserCheckService _userCheckService;
	
	public UserManager(IUserCheckService userCheckService) {
		_userCheckService = userCheckService;
	}
	
	public void update(User user) {
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Bilgileriniz g�ncellendi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
	}
	public void delete(User user) {
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Bilgileriniz silindi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
	}
	public void signUp(User user) {
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullan�c� bilgileri kaydedildi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
		
		}
	public void info(User user) {
	
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Ad�n�z-Soyad�n�z : "+user.getFirstName()+" "+user.getLastName());
			System.out.println("TC Kimlik numaran�z : "+user.getNationalIdentity());
			System.out.println("Do�um tarihiniz : "+user.getDateOfBirth());}
		
		else { System.out.println("Not a valid person");}
		
		}
	
}
