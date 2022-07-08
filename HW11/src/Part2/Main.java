package Part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static void menu() {
	System.out.println();
	System.out.println("Enter 1 to output an array of random cars");
	System.out.println("Enter 2 to fill an array with the same values of a random car");
	}
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	HelmMaterials HM[] = HelmMaterials.values();
	
	while (true) {
		menu();
		
		switch(scanner.nextInt()) {
		
		case 1: {
			Auto AutoArray[][] = new Auto[RandomValue(1,5)][RandomValue(1,5)];
			
			for (int i =0; i <AutoArray.length; i++) {
				for (int s = 0; s<AutoArray[i].length; s++) {
					AutoArray[i][s] = new Auto(RandomValue(100, 250),
							RandomValue(2000,2022),
							new Helm(RandomValue(35,50),
									HM [RandomValue (0, HM.length -1)].toString()), 
									new Engine(RandomValue(2,12)));
				}
			}
			System.out.println(Arrays.deepToString(AutoArray));
			
			break;
		}
		
		case 2: {
			Auto auto = new Auto(RandomValue(100,250),RandomValue(2000,2022),
					new Helm(RandomValue(35,50),     
							HM [RandomValue (0, HM.length -1)].toString()), 
					new Engine(RandomValue(2,12)));
			
			Auto autoArray[] = new Auto[RandomValue(1,5)];
			Arrays.fill(autoArray, auto);
			
			System.out.println(Arrays.deepToString(autoArray));
			
			break;
	
		}
		
		default : {
			System.out.println("Only 1 or 2 can be entered");
			break;
		}
		
		
		}
	}
		
	
	}

	 static int RandomValue(int min, int max) {
		if (min>=max) {
			throw new IllegalArgumentException("Min value must be less than max value");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}
