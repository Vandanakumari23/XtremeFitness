package com.XtremeFitess.login;

public interface UserDAO {

	void register(User user);
	User validateUser(Login login);
}
