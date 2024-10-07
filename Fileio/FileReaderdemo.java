package Fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {
	public static void main(String args[]) throws IOException {
		FileReader fr=new FileReader("D:\\Chinmay\\myfile.txt");
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
