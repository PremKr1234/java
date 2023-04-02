package org.account;

public class Login extends SignUp {
	public void btnLogin() {
		System.out.println("BtnLogin");
	}
	public void mob() {
	System.out.println("tam");

	}
	public static void main(String[] args) {
		Login l =new Login();
		l.userName();
		l.password();
		l.btnLogin();
	}

}
