package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInPanel extends Setting {

	public LogInPanel(String game, int highscore, String companyName, String genre, double rating, String platform) {
		super(game, highscore, companyName, genre, rating, platform);
	}

	public LogInPanel() {
		// TODO Auto-generated constructor stub
	}

	JFrame frameLog;
	JPanel panelLogIn;

	static JTextField username;
	static JPasswordField password;

	JLabel userLabel, passwordLabel, message;

	JButton logInButton;

	static FileWriter fw;
	static BufferedReader br;

	static String file = "src/FinalJavaProject/UserLogins.txt";

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

		try {
			userExists(username.getText(), password.getText());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		logInButton.addActionListener(e -> logInPressed());
	}

	public static void logInPressed() {
		setUsername(username.getText());
		setPassword(password.getText());

		if (NewAcctPanel.usersMap.containsKey(getUsername())) {
			String storedPassword = NewAcctPanel.usersMap.get(getUsername());
			if (storedPassword.equals(getPassword())) {
				JOptionPane.showMessageDialog(null, "Log In Successful", "SUCCESS", JOptionPane.PLAIN_MESSAGE);

				SaveToFiles saver = new SaveToFiles();
				saver.gameLibrary();

			} else {
				JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Failed to Log In", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static boolean userExists(String username, String password) throws IOException {
		// returns true if hashmap has key. If in file, key and value will be added to
		// hashmap

		String line;
		br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {

			String[] parts = line.split(" : ", 2);
			if (parts.length >= 2) {
				String key = parts[0];
				String value = parts[1];
				NewAcctPanel.usersMap.put(key, value);
				System.out.println("adding");
				System.out.println(NewAcctPanel.usersMap);
			} else {
				System.out.println(NewAcctPanel.usersMap);
			}

		}

		br.close();

		return false;
	}
}
