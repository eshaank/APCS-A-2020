package Unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class WordSearch {
	private String[][] m;

	public WordSearch(int size, String str) {
		m = new String[size][str.length() / size];
		int counter = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = str.charAt(counter) + "";
				counter++;
			}
		}
	}

	public boolean isFound(String word) {
		boolean found = false;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length - word.length(); j++) {
				if (checkRight(word, i, j)) {
					found = true;
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = m.length; j >= word.length(); j--) {
				if (checkLeft(word, i, j)) {
					found = true;
				}
			}
		}
		for (int i = 0; i < m.length - word.length(); i++) {
			for (int j = 0; j < m.length; j++) {
				if (checkUp(word, i, j)) {
					found = true;
				}
			}
		}
		for (int i = m.length; i >= word.length(); i--) {
			for (int j = 0; j < m.length; j++) {
				if (checkDown(word, i, j)) {
					found = true;
				}
			}
		}
		return found;
	}

	public boolean checkRight(String w, int r, int c) {
		for (int i = 0; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r][c + i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c) {
		for (int i = w.length() - 1; i >= 0; i--) {
			if (!(w.charAt(i) + "").equals(m[r][c - i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c) {
		for (int i = 0; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r + i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c) {
		for (int i = w.length() - 1; i >= 0; i--) {
			if (!(w.charAt(i) + "").equals(m[r - i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		return false;
	}

	public String toString() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		return "";
	}
}