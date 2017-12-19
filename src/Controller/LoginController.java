package Controller;

import Model.Parameter;
//用於用戶登錄驗證
public class LoginController {
	public void setting(String username, String password) {
		Parameter.username = username;
		Parameter.password = password;
	}
//隨著數據庫的引入，此方法已過時
	public Boolean isLogin(String username, String password) {
		if (username.equals("ntust") && password.equals("ntust")) {
			return true;
		} else {
			return false;
		}
	}

}
