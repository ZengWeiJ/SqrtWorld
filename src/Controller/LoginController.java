package Controller;

import Model.Parameter;
//����Ñ������C
public class LoginController {
	public void setting(String username, String password) {
		Parameter.username = username;
		Parameter.password = password;
	}
//�S������������룬�˷������^�r
	public Boolean isLogin(String username, String password) {
		if (username.equals("ntust") && password.equals("ntust")) {
			return true;
		} else {
			return false;
		}
	}

}
