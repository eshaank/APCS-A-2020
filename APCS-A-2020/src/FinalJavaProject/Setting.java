package FinalJavaProject;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Setting extends JPanel {
	JFrame frameLog;
	JPanel panelLogIn;

	JFrame frameAcct;
	JPanel panelAccount;

	static JTextField registerUser;
	static JPasswordField registerPassword;

	static JTextField username;
	static JPasswordField password;

	JLabel userLabel, passwordLabel, message;

	JButton submitButton;
	JButton logInButton;

	static HashMap<String, String> usersMap = new HashMap<>();
	static boolean succAcct = false;
	static boolean succLog = false;

	public static void CreateAccountPressed() {
		Setting setting = new Setting();
		String username = registerUser.getText();
		String password = registerPassword.getText();

		if (usersMap.containsKey(username)) {
			JOptionPane.showMessageDialog(null, "User already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			usersMap.put(username, password);
			JOptionPane.showMessageDialog(null, "Registration Successful", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
			
			LogInPanel log = new LogInPanel();
			log.logIn();
			
		}
		System.out.println(usersMap);
	}

	public static void logInPressed() {
		String user = username.getText();
		String pass = password.getText();

		if (usersMap.containsKey(user)) {
			String storedPassword = usersMap.get(user);
			if (storedPassword.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Log In Successful", "SUCCESS", JOptionPane.PLAIN_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	static boolean getSuccAcct() {
		return succAcct;
	}

	public static void setSuccAcct(boolean val) {
		succAcct = val;
	}
	

}
