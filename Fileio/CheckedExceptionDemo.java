package Fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
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
	}

}
