package org.account;

public class Login extends SignUp {
	public void btnLogin() {
		System.out.println("BtnLogin");
	}
	public void hello ()
{
System.out.println("Hello iam altron");		
	}
	public static void main(String[] args) {
		Login l =new Login();
		l.userName();
		l.password();
		l.btnLogin();
	}

}
