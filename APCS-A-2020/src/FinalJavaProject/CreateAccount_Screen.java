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

public class CreateAccount_Screen extends Setting {

	CreateAccount_Screen() {
		
	}
	
	public void createAcct() {
		frame = new JFrame();
		panel = new JPanel(new GridLayout(3, 1));

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();

		registerUser = new JTextField();
		registerPassword = new JPasswordField();

		submitButton = new JButton("Submit");

		panel.add(userLabel);
		panel.add(registerUser);
		panel.add(passwordLabel);
		panel.add(registerPassword);
		panel.add(message);
		panel.add(submitButton);

		userLabel.setText("User Name :");
		passwordLabel.setText("Password :");

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Create Account");
		frame.setSize(450, 350);
		frame.setVisible(true);

		submitButton.addActionListener(e -> CreateAccountPressed());
	}
	
}
