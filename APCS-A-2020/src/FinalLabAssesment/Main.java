package FinalLabAssesment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/eshaankansagara/Desktop/APCS-A-2020/APCS-A-2020/src/FinalLabAssesment/CarData");
		Scanner scan = new Scanner(file);
		String dealershipName = scan.nextLine();
		
		Dealership dealership = new Dealership(dealershipName); 
		
		int totalCars = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < totalCars; i++) {
			String name = scan.nextLine();
			String mpgList = scan.nextLine();
			
			dealership.addCars(new CarBrand(name, mpgList));
		}
		
		System.out.println(dealership);
	}
}