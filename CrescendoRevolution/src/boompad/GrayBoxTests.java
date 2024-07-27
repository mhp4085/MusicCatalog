package boompad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrayBoxTests {

	public static void main(String[] args) {
		File f = new File("data.txt");
		doesFileExist(f);
		isFileClean(f);
		try {
			isFormattedCorrectly(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void doesFileExist(File f) {
		if (!f.exists())
			System.out.println("Test 1 failed. File does not exist");
		else
			System.out.println("Test 1 passed. File exists in the correct location.");
	}
	
	public static void isFileClean(File f) {
		if (!f.canExecute())
			System.out.println("Test 2 failed. File is not clean");
		else
			System.out.println("Test 2 passed. File is clean.");
	}
	
	public static void isFormattedCorrectly(File f) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			String test = sc.nextLine();
			int count = 0;
			for (int i = 0; i < test.length(); i++) {
				if (test.charAt(i) == ',')
					count++;
			}
			if (count != 7) {
				System.out.println("Test 3 failed. File is improperly formatted.");
				return;
			}
		}
		System.out.println("Test 3 passed. File is properly formatted.");
	}
}
