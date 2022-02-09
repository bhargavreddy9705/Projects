package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandelingAppend {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter a = new FileWriter("/Users/apple/Desktop/mphasisproject3.rtf",true);
		BufferedWriter b= new BufferedWriter(a);
		b.write("Hello How R u?");
		b.newLine();
		b.close();
	    a.close();
	    System.out.println("File appended");
	}

}