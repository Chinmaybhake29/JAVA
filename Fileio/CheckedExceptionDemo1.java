package Fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo1 {

	public static void main(String args[]) {
		try {
				FileInputStream f = new FileInputStream("D:\\Chinmay\\myfile.txt");
				int k;
				try {
					while ((k = f.read()) != -1) {
						System.out.print((char) k);
					}
					f.close();
				} catch (FileNotFoundException e) {
					System.out.println(e);
				}
		} catch (IOException e) {
			System.out.println("Please! Spacifies correct path file " + e.getMessage());
		}
	}
}
