package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		try {
		FileInputStream fis = new FileInputStream("D:\\chinmani\\myfile123.txt");
		int k;
		while((k=fis.read()) !=-1) //-1 is because till end of file it will print 
		{
			System.out.print((char)k);
		}
		fis.close();
	}catch(FileNotFoundException e) {
		System.out.println("Error : path is wrong for the file, check the path...");
	}

}
}