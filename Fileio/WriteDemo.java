package Fileio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("D:\\Chinmay\\myfile.txt");
		FileOutputStream out=new FileOutputStream("D:\\Chinmay\\newfile.txt");
		int i;
		while((i=fr.read()) != -1) {
			out.write(i);
		}
		
	}
}
