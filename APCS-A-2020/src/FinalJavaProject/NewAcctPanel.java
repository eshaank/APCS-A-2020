package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NewAcctPanel {
	static HashMap<String, String> usersMap = new HashMap<>();

	JFrame frameAcct;
	JPanel panelAccount;

	static JTextField registerUser;
	static JPasswordField registerPassword;

	JLabel userLabel, passwordLabel, message;

	JButton signInButton;
	JButton submitButton;

	public void newAcct() {
		frameAcct = new JFrame();
		panelAccount = new JPanel(new GridLayout(3, 1));

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();

		registerUser = new JTextField();
		registerPassword = new JPasswordField();

		submitButton = new JButton("Submit");
		signInButton = new JButton("Sign In");

		panelAccount.add(userLabel);
		panelAccount.add(registerUser);
		panelAccount.add(passwordLabel);
		panelAccount.add(registerPassword);
		panelAccount.add(signInButton);
		panelAccount.add(submitButton);

		userLabel.setText("User Name :");
		passwordLabel.setText("Password :");

		frameAcct.add(panelAccount, BorderLayout.CENTER);
		frameAcct.setTitle("Create Account");
		frameAcct.setSize(400, 300);
		frameAcct.setVisible(true);

		submitButton.addActionListener(e -> CreateAccountPressed());
		signInButton.addActionListener(e -> goToLoginPage());

	}

	public static void goToLoginPage() {

		LogInPanel log = new LogInPanel();
		log.logIn();
	}

	public static void CreateAccountPressed() {

		String username = registerUser.getText();
		
		String password = registerPassword.getText();

		if (usersMap.containsKey(username)) {
			JOptionPane.showMessageDialog(null, "User already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			if (password.length() <= 4) {
				JOptionPane.showMessageDialog(null, "Password not long enough (must be at least 4)", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			} else {
				usersMap.put(username, password);
				JOptionPane.showMessageDialog(null, "Registration Successful", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
			}
		}
		// System.out.println(usersMap);
	}
}
