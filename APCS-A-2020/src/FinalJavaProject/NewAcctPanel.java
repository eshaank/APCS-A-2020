package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

	static FileWriter fw;
	static BufferedReader br;

	static String file = "src/FinalJavaProject/UserLogins.txt";

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

		try {
			if (nameTaken(username)) {
				JOptionPane.showMessageDialog(null, "User already exists", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				if (password.length() <= 4) {
					JOptionPane.showMessageDialog(null, "Password not long enough (must be at least 4)", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {

					usersMap.put(username, password);
					JOptionPane.showMessageDialog(null, "Registration Successful", "SUCCESS",
							JOptionPane.PLAIN_MESSAGE);

					saveToFile();
				}
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void saveToFile() {

		// Saves the entered username to a file for recurring use

		try {

			fw = new FileWriter(file, true);

			for (Map.Entry<String, String> entry : usersMap.entrySet()) {

				fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}

			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// always close the writer
				fw.close();
			} catch (Exception e) {
			}
		}
	}

	public static boolean nameTaken(String username) throws IOException {

		String line;
		br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {

			if (line.contains(username)) {
				System.out.println("found user");
				return true;
			}
		}

		br.close();

		if (usersMap.containsKey(registerUser.getText())) {
			return true;
		}
		return false;
	}
}
