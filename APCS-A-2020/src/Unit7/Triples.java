package Unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		setNum(num);

	}

	public void setNum(int num) {
		number = num;

	}

	public String findTriples() {
		String total = "";
		int max = number;
		
		for (int i = 1; i <= max - 2; i++) {
			for (int j = i + 1; j <= max - 1; j++) {
				for (int k = j + 1; k <= max; k++) {
					if ((i * i) + (j * j) == (k * k)) {
						if ((i % 2 == 0 && j % 2 > 0 && k % 2 > 0) || (i % 2 > 0 && j % 2 == 0 && k % 2 > 0)) {
							if (GCF(i, j, k) == 1) {
								total += "\n" + i + " " + j + " " + " " + k;
							}
						}
					}
				}
			}
		}
		return total;
	}

	private int GCF(int a, int b, int c) {
		int max = 0;
		int limit = Math.min(a, b);
		limit = Math.min(limit, c);
		
		for (int i = limit; i >= 0; i--) {
			if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
				return i;
			}
		}

		return 1;
	}

	public String toString() {

		return findTriples() + "";
	}
}