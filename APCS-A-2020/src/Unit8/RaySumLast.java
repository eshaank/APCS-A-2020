package Unit8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast {
	public static int go(int[] ray) {
		int last = ray[ray.length - 1];
		int sum = 0;
		
		
		for (int i = 0; i <= ray.length - 1; i++) {
			if(ray[i] > last) {
				sum += ray[i];
			}
		}
		if(sum == 0) {
			return -1;
		}
		return sum;
	}
}