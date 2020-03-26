package service;

import dto.UserAccountDto;
import dto.UserRegDto;


public interface UserService {
	UserAccountDto register(UserRegDto user);
	
	

}
