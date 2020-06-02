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
		frameAcct = new JFrame();
		panelAccount = new JPanel(new GridLayout(3, 1));

		frameAcct.getContentPane().add(panelAccount);

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();

		registerUser = new JTextField();
		registerPassword = new JPasswordField();

		submitButton = new JButton("Submit");
		

		panelAccount.add(userLabel);
		panelAccount.add(registerUser);
		panelAccount.add(passwordLabel);
		panelAccount.add(registerPassword);
		panelAccount.add(message);
		panelAccount.add(submitButton);

		userLabel.setText("User Name :");
		passwordLabel.setText("Password :");

		frameAcct.add(panelAccount, BorderLayout.CENTER);
		frameAcct.setTitle("Create Account");
		frameAcct.setSize(450, 350);
		frameAcct.setVisible(true);

		submitButton.addActionListener(e -> CreateAccountPressed());
		
		
	}

}
