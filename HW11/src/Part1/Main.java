package Part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer array [] = new Integer[RandomValue(-7,30)];
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = RandomValue(-1000,1000);
		}
		
		System.out.println("Source array" + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Source array, sorted ascending" + Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Source array, sorted descending" + Arrays.toString(array));
	
	}
	
	static int RandomValue (int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}
		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
		
	}
	
}
