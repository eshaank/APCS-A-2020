package FinalJavaProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SaveToFiles extends Setting implements ActionListener {
	public SaveToFiles(String game, int highscore, String companyName, String genre, double rating, String platform) {
		super(game, highscore, companyName, genre, rating, platform);
		// TODO Auto-generated constructor stub
	}

	public SaveToFiles() {
		// TODO Auto-generated constructor stub
	}

	JFrame frame;
	JPanel panel;

	JButton addgame;
	JButton viewList;
	JButton removegame;
	JButton saveList;
	JButton loadList;
	JButton viewGameDetails;

	boolean printText = false;

	ArrayList<String> gameList = new ArrayList<String>();

//	public static void main(String[] args) {
//		SaveToFiles test = new SaveToFiles();
//		test.gameLibrary();
//	}

	@SuppressWarnings("deprecation")
	public void gameLibrary() {
		frame = new JFrame("Game Library");
		panel = new JPanel(new GridLayout(5, 1));

		addgame = new JButton("Add game");
		viewList = new JButton("View List");
		removegame = new JButton("Remove game");
		saveList = new JButton("Save List");
		loadList = new JButton("Load List");
		viewGameDetails = new JButton();

		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.add(panel);

		panel.add(addgame);
		panel.add(viewList);
		panel.add(removegame);
		panel.add(saveList);
		panel.add(loadList);

		addgame.addActionListener(this);
		viewList.addActionListener(this);
		removegame.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addgame) {
			String game = JOptionPane.showInputDialog("Enter a game to be saved");
			gameList.add(":" + game);
		}

		String display = "";
		for (int i = 0; i < gameList.size(); i++) {
			display += gameList.get(i) + "\n";
		}

		if (e.getSource() == viewList) {
			JOptionPane.showMessageDialog(null, display);
		}

		if (e.getSource() == removegame) {
			String remove = JOptionPane.showInputDialog("Enter a game to remove: \n" + display);
			for (int i = 0; i < gameList.size(); i++) {
				if (gameList.get(i).equalsIgnoreCase(remove)) {
					gameList.remove(i);
				}
			}
			System.out.println(gameList);
		}
		if (e.getSource() == saveList) {
			try {
				BufferedReader load = new BufferedReader(new FileReader("src/FinalJavaProject/SavedContents.txt"));
				FileWriter saveFile = new FileWriter("src/FinalJavaProject/SavedContents.txt", true);

				String temp = "";
				temp = load.readLine();
				if (temp == null) {
					saveFile.write(getUsername() + "\n\n");
					saveFile.write(display);
					saveFile.write(getUsername() + ":\n\n");
					saveFile.close();
				}
				while (temp != null) {

					if (temp.equals(getUsername())) {
						if (temp.equals(getUsername())) {
							printText = true;
						} else if (temp.contains(getUsername() + ":")) {
							printText = false;
						}
						if (printText == true) {
							saveFile.write(display);
						}
					} else {
						saveFile.write(getUsername() + "\n\n");
						saveFile.write(display);
						saveFile.write(getUsername() + ":\n\n");
						saveFile.close();
					}
					temp = load.readLine();
				}
				load.close();
			} catch (IOException p) {
				p.printStackTrace();
			}
		}
		if (e.getSource() == loadList) {
			try {
				BufferedReader load = new BufferedReader(new FileReader("src/FinalJavaProject/SavedContents.txt"));

				String fileContents = "";
				String temp = "";
				temp = load.readLine();
				while (temp != null) {
					if (temp.equals(getUsername())) {
						printText = true;
					} else if (temp.contains(getUsername() + ":")) {
						printText = false;
					}
					if (printText == true) {
						fileContents += temp + "\n";
					}

					temp = load.readLine();
				}

				JOptionPane.showMessageDialog(null, fileContents);
				// fileContents = load.readLine();

				load.close();
			} catch (FileNotFoundException p1) {
				// TODO Auto-generated catch block
				p1.printStackTrace();
			} catch (IOException p2) {
				// TODO Auto-generated catch block
				p2.printStackTrace();
			}
		}
	}
}
