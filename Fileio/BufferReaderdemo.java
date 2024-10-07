package Fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderdemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Chinmay\\myfile.txt");
		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr); // 200 number of chararcter to read
		String str;
		while ((str = br.readLine()) != null) {
			// to read a line : 200
			System.out.println(str);
			// Thread.sleep(2000);
		}

	}

}
