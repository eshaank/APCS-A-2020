package FinalJavaProject;

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

public class SaveToFiles implements ActionListener {
	JFrame frame;
	JPanel panel;

	JButton addgame;
	JButton viewList;
	JButton removegame;
	JButton saveList;
	JButton loadList;
	JButton viewGameDetails;

	ArrayList<String> gameList = new ArrayList<String>();

	public static void main(String[] args) {
		SaveToFiles saver = new SaveToFiles();
		saver.gameMaster();

	}

	@SuppressWarnings("deprecation")
	void gameMaster() {
		frame = new JFrame();
		panel = new JPanel();

		addgame = new JButton();
		viewList = new JButton();
		removegame = new JButton();
		saveList = new JButton();
		loadList = new JButton();
		viewGameDetails = new JButton();

		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.add(panel);

		addgame.setLabel("Add game");
		viewList.setLabel("View List");
		removegame.setLabel("Remove game");
		saveList.setLabel("Save List");
		loadList.setLabel("Load List");

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
			gameList.add(game);
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
				FileWriter saveFile = new FileWriter("src/FinalJavaProject/SavedContents.txt");
				saveFile.write(display);
				saveFile.close();

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

					fileContents += temp + "\n";
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
