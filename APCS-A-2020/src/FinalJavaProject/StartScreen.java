package FinalJavaProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class StartScreen extends JPanel {
	JFrame frame;
	JPanel panel;

	JLabel userLabel, passwordLabel, message, empty, empty1;

	JButton button;
	NewAcctPanel createAcct = new NewAcctPanel();
	

	public void startScreen() {
		frame = new JFrame();
		panel = new JPanel(new GridLayout(3, 1));

		userLabel = new JLabel();
		passwordLabel = new JLabel();
		message = new JLabel();
		empty = new JLabel();
		empty1 = new JLabel();

		button = new JButton("Continue");

		panel.add(userLabel);
		panel.add(empty);
		panel.add(passwordLabel);
		panel.add(empty1);
		panel.add(button);
		panel.add(message);
		

		userLabel.setText("Game Library");
		passwordLabel.setText("Eshaan Kansagara");

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Continue");
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		button.addActionListener(e -> buttonPressed());
		
	}

	public void buttonPressed() {
		JOptionPane.showMessageDialog(null,
				"Create an account or log into an existing account. Log games to a library that may be saved. \nLog the details of the game and view them at another time. Add or remove games at any time, as well as load games freom the existing library.\nYou can save this library anytime, log out and log back in to view the library at anytime.");
		createAcct.newAcct();
	}

}
