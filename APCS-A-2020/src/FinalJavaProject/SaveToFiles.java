package FinalJavaProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SaveToFiles extends Setting implements ActionListener {
	public SaveToFiles(String game, int highscore, String companyName, String genre, double rating, String platform) {
		super(game, highscore, companyName, genre, rating, platform);
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
	JButton startScreen;

	boolean printText = false;

	ArrayList<String> gameList = new ArrayList<>();
	ArrayList<String> tempList = new ArrayList<>();
	ArrayList<String> viewDetailsList = new ArrayList<>(); // File updatedFile = new
															// File("src/FinalJavaProject/UpdatedSavedContents.txt");

	@SuppressWarnings("deprecation")
	public void gameLibrary() {
		frame = new JFrame("Game Library");
		panel = new JPanel(new GridLayout(5, 1));

		addgame = new JButton("Add game");
		viewList = new JButton("View List");
		removegame = new JButton("Remove game");
		saveList = new JButton("Save List");
		loadList = new JButton("Load List");
		viewGameDetails = new JButton("View Game Details");
		startScreen =  new JButton("Log Out");

		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.add(panel);

		panel.add(addgame);
		panel.add(viewList);
		panel.add(removegame);
		panel.add(saveList);
		panel.add(loadList);
		panel.add(viewGameDetails);
		panel.add(startScreen);

		addgame.addActionListener(this);
		viewList.addActionListener(this);
		removegame.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		viewGameDetails.addActionListener(this);
		startScreen.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addgame) {
			String game = JOptionPane.showInputDialog("Enter a game to be saved");
			String highscore = JOptionPane.showInputDialog("Enter the highscore");
			String companyName = JOptionPane.showInputDialog("Enter the company name");
			String genre = JOptionPane.showInputDialog("Enter the genre");
			String rating = JOptionPane.showInputDialog("Enter the rating");
			String platform = JOptionPane.showInputDialog("Enter platform");

			int score = Integer.parseInt(highscore);
			double ratings = Double.parseDouble(rating);

			setGameName(game);

			setHighScore(score);

			setCompany(companyName);

			setGenre(genre);

			setRating(ratings);

			setPlatform(platform);

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
		}
		if (e.getSource() == saveList) {
			Path path = Paths.get("src/FinalJavaProject/SavedContents.txt");
			List<String> lines;
			try {
				BufferedReader load = new BufferedReader(new FileReader("src/FinalJavaProject/SavedContents.txt"));
				FileWriter saveFile = new FileWriter("src/FinalJavaProject/SavedContents.txt", true);
				File file = new File("src/FinalJavaProject/SavedContents.txt");
				LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
				Path path1 = Paths.get("src/FinalJavaProject/SavedContents.txt");

				String temp = "";
				temp = load.readLine();

				while (temp != null) {

					if (temp.contains(getUsername())) {
						// lineNumberReader.skip(Long.MAX_VALUE);
						int lines1 = lineNumberReader.getLineNumber() + 1;
						lineNumberReader.close();

						lines = Files.readAllLines(path, StandardCharsets.UTF_8);

						int position = lines1;
						String extraLine = display;

						lines.add(position, extraLine);
						Files.write(path, lines, StandardCharsets.UTF_8);

					}
					break;
				}

			} catch (IOException e2) {

				e2.printStackTrace();
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

		if (e.getSource() == viewGameDetails) {

			ArrayList<String> showDetails = new ArrayList<>();
			String remove = JOptionPane.showInputDialog("Enter a game to view details for: \n" + display);
			for (int i = 0; i < gameList.size(); i++) {

				if (gameList.get(i).equalsIgnoreCase(remove)) {
					JOptionPane.showMessageDialog(null, String());
				}

			}

		}
		if (e.getSource() == startScreen) {
			StartScreen start = new StartScreen();
			start.startScreen();
		}
	}
}
