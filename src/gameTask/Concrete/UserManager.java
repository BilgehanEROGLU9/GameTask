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
			System.out.println("Bilgileriniz güncellendi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
	}
	public void delete(User user) {
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Bilgileriniz silindi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
	}
	public void signUp(User user) {
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Kullanýcý bilgileri kaydedildi : "+user.getFirstName());}
		
		else { System.out.println("Not a valid person");}
		
		}
	public void info(User user) {
	
		if(_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Adýnýz-Soyadýnýz : "+user.getFirstName()+" "+user.getLastName());
			System.out.println("TC Kimlik numaranýz : "+user.getNationalIdentity());
			System.out.println("Doðum tarihiniz : "+user.getDateOfBirth());}
		
		else { System.out.println("Not a valid person");}
		
		}
	
}
