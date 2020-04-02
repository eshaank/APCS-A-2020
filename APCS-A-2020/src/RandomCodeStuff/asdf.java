package RandomCodeStuff;

public class asdf {
	public static void main(String[] args) {
//		String a = "a";
//		String b = "a";
//		System.out.println(a.compareTo(b));
		
//		Integer z = new Integer(0);
//		System.out.println(Integer.compare(z, 0));
		
	int[] stuff = {3, 61, 15, 11, 7, 9, 2};
	
	sort(stuff);
		
	}
	
	public static boolean truthTable(boolean e, boolean f) {
		boolean d;
		d = !(f || e);
		return d;
	}
	
	public static void sort(int[] stuff) {
		for (int i = 1; i < stuff.length - 1; ++i) {
			int val = stuff[i];
			int j = i;
			while (j > 0 && val < stuff[j-1]) {
				stuff[j] = stuff[j-1];
				j--;
			}
			stuff[j] = val;
			
			for (int k = 0; k < stuff.length; k++) {
				System.out.print(stuff[k] + " ");
			}
			System.out.println("");
		}
	
		
		
	}
	
}
