package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn_Screen extends Setting {

	LogIn_Screen() {
		
	}

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
		

		logInButton.addActionListener(e -> logInPressed());
		
		
	}



}
