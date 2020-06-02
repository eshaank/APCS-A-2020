package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInPanel {
	
	JFrame frameLog;
	JPanel panelLogIn;

	static JTextField username;
	static JPasswordField password;
	
	JLabel userLabel, passwordLabel, message;
	
	JButton logInButton;
	
	public void logIn() {

		frameLog = new JFrame();
		panelLogIn = new JPanel(new GridLayout(3, 1));

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();

		username = new JTextField();
		password = new JPasswordField();

		logInButton = new JButton("Sign In");

		panelLogIn.add(userLabel);
		panelLogIn.add(username);
		panelLogIn.add(passwordLabel);
		panelLogIn.add(password);
		panelLogIn.add(message);
		panelLogIn.add(logInButton);

		userLabel.setText("User Name :");
		passwordLabel.setText("Password :");

		frameLog.add(panelLogIn, BorderLayout.CENTER);
		frameLog.setTitle("Log In");
		frameLog.setSize(400, 300);
		frameLog.setVisible(true);

		logInButton.addActionListener(e -> logInPressed());
	}
	
	public static void logInPressed() {
		String user = username.getText();
		String pass = password.getText();

		if (NewAcctPanel.usersMap.containsKey(user)) {
			String storedPassword = NewAcctPanel.usersMap.get(user);
			if (storedPassword.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Log In Successful", "SUCCESS", JOptionPane.PLAIN_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}
