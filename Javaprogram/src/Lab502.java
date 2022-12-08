import javax.swing.*;
public final class Lab502 {
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail();
	}
	public static void inputEmail() {
		email = JOptionPane.showInputDialog("Input your e-mail:");
		checkEmailError(email);
	}
	public static void checkEmailError(String chkEmail) {
		while(chkEmail.startsWith("@")||chkEmail.contains("")) {
			chkEmail = JOptionPane.showInputDialog("Input your e-mail,again:");
		}
		chkEmail = chkEmail.toLowerCase();
		boolean checkEmail1 = chkEmail.endsWith("@gmail.com")||chkEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)
		?"You e-mail is "+chkEmail
		:"Your e-mail is not hotmaiil or gmail dot com");
	}

}
