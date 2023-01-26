package com.codewithakshay.birthdayreminder.postgres.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithakshay.birthdayreminder.postgres.model.Login;
import com.codewithakshay.birthdayreminder.postgres.repository.UserManagementRepository;
import com.codewithakshay.birthdayreminder.postgres.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserManagementRepository userManagementRepository;

	@Override
	public String loginUser(Login login) {
		
		return null;
	}

}
