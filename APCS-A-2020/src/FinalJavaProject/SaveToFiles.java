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

	JButton addTask;
	JButton viewList;
	JButton removeTask;
	JButton saveList;
	JButton loadList;

	ArrayList<String> taskList = new ArrayList<String>();

	public static void main(String[] args) {
		SaveToFiles saver = new SaveToFiles();
		saver.taskMaster();

	}

	@SuppressWarnings("deprecation")
	void taskMaster() {
		frame = new JFrame();
		panel = new JPanel();

		addTask = new JButton();
		viewList = new JButton();
		removeTask = new JButton();
		saveList = new JButton();
		loadList = new JButton();

		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.add(panel);

		addTask.setLabel("Add Task");
		viewList.setLabel("View List");
		removeTask.setLabel("Remove Task");
		saveList.setLabel("Save List");
		loadList.setLabel("Load List");

		panel.add(addTask);
		panel.add(viewList);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);

		addTask.addActionListener(this);
		viewList.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addTask) {
			String task = JOptionPane.showInputDialog("Enter a task to be saved");
			taskList.add(task);
		}

		String display = "";
		for (int i = 0; i < taskList.size(); i++) {
			display += taskList.get(i) + "\n";
		}

		if (e.getSource() == viewList) {
			JOptionPane.showMessageDialog(null, display);
		}

		if (e.getSource() == removeTask) {
			String remove = JOptionPane.showInputDialog("Enter a task to remove: \n" + display);
			for (int i = 0; i < taskList.size(); i++) {
				if (taskList.get(i).equalsIgnoreCase(remove)) {
					taskList.remove(i);
				}
			}
			System.out.println(taskList);
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
