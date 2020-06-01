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

		frame = new JFrame();
		panel = new JPanel(new GridLayout(3, 1));

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();

		username = new JTextField();
		password = new JPasswordField();

		logInButton = new JButton("Sign In");

		panel.add(userLabel);
		panel.add(username);
		panel.add(passwordLabel);
		panel.add(password);
		panel.add(message);
		panel.add(logInButton);

		userLabel.setText("User Name :");
		passwordLabel.setText("Password :");

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Log In");
		frame.setSize(400, 300);
		frame.setVisible(true);

		logInButton.addActionListener(e -> logInPressed());
		
		
	}



}
