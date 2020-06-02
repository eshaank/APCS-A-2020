package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInPanel extends Setting {

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
}
