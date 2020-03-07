package Unit10;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore8 {
	private ArrayList<Toy> toyList;

	public ToyStore8() {
		toyList = new ArrayList<Toy>();

	}

	public ToyStore8(String toys) {
		loadToys(toys);
	}

	public void loadToys(String toys) {

		int ind = toys.indexOf(" ");
		toyList.add(new Toy(toys.substring(0, ind)));
		while (ind > 0) {
			String toy = toys.substring(0, ind);
			Toy newToy = new Toy(toy);
			boolean bool = false;
			for (int i = 0; i < toyList.size(); i++) {
				if (toyList.get(i).getName().equals(toy)) {
					toyList.get(i).setCount(toyList.get(i).getCount() + 1);
					bool = true;
				}
			}
			if (!bool) {
				toyList.add(newToy);
				toyList.get(toyList.size() - 1).setCount(1);
			}
			toys = toys.substring(ind + 1);
			ind = toys.indexOf(" ");
		}

		for (String name : toys.split(" ")) {
			Toy t = getThatToy(name);
			if (t == null) {
				toyList.add(new Toy(name));
			} else {
				t.setCount(t.getCount() + 1);
			}
		}

	}

	public Toy getThatToy(String nm) {
		for (Toy toy : toyList) {
			if (toy.getName().equals(nm)) {
				return toy;
			}
		}
		return null;
	}

	public String getMostFrequentToy() {
		int greatest = 0;
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getCount() > toyList.get(greatest).getCount()) {
				greatest = i;
			}
		}
		return toyList.get(greatest).getName();
	}

	public void sortToysByCount() {
		ArrayList<Toy> temp = new ArrayList<Toy>();
		while (toyList.size() > 0) {
			Toy greatest = getThatToy(getMostFrequentToy());
			toyList.remove(greatest);
			temp.add(greatest);
		}

		toyList = temp;
	}

	public String myName() {
		return "Eshaan Kansagara";
	}

	public String toString() {
		return toyList.toString() + "";
	}
}