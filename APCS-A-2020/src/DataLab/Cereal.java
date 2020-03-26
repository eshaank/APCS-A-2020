package DataLab;

import javax.swing.JOptionPane;

public class Cereal {

	private String name;
	private char type;
	private int calories, protein, fat, sodium, fiber, carbs, sugar, potassium, vitamins, shelf;
	private double weight, cups, rating;
	
   
   Cereal(String nm, char tp, int cal, int ptn, int f, int sod, int fib, int carb, int sug, int ptsm, int vtm, int shf, double wght, double cps, double rtng) {
      
	   this.name = nm;
	   this.type = tp;
	   this.calories = cal;
	   this.protein = ptn;
	   this.fat = f;
	   this.sodium = sod;
	   this.fiber = fib;
	   this.carbs = carb;
	   this.sugar = sug;
	   this.potassium = ptsm;
	   this.vitamins = vtm;
	   this.shelf = shf;
	   this.weight = wght;
	   this.cups = cps;
	   this.rating = rtng;
	   
   }
   
   
   public int getCarb() { 
      return carbs;
   }
   
   public String getName() { 
      return name;
   }
   public int getProtein() { 
	      return protein;
	   }
   
   
   public String toString() {
	   return getName() + ": " + getCarb() + "g carbs + " + getProtein() + "g protein";
   }
   
   public static void main(String[] args) {
	   Cereal num1 = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402);
	   Cereal num2 = new Cereal("Cinnamon Toast Crunch", 'C', 120, 1, 3, 210, 0, 13, 9, 45, 25, 2, 1, 0.75, 19.824);
	   Cereal num3 = new Cereal("Cap'n'Crunch", 'C', 120, 1, 2, 220, 0, 12, 12, 35, 25, 2, 1, 0.75, 18.042);
	   
	   Cereal[] brands = {num1, num2, num3};
	   
	   Cereal bestBrand = brands[0];
	   
	   for (int i = 1; i < brands.length; i++) {
		   if (brands[i].getCarb() <= bestBrand.getCarb() && brands[i].getProtein() >= bestBrand.getProtein()) {
			   bestBrand = brands[i];
		   }
	   }
	   
	   JOptionPane.showMessageDialog(null, "Of the cereal brands: \n" + num1.getName() + ", " + num2.getName() + ", " + num3.getName() + ": \n" + "The best low carb, high protein cereal is: " + bestBrand);
	   
   }
   
}
