import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JFileChooser;


public class FileCopyrighter {
	String destination = "/Users/alec/Desktop/junk/";
	String fileName = "";
public static void main(String[] args) {
	FileCopyrighter x = new FileCopyrighter();
}
FileCopyrighter(){
		File[] files = new File(destination).listFiles();
		System.out.println(files.length);
	for (File f: files) {
		String filename = f.getName();
		System.out.println(filename);
		try {
			FileWriter fw = new FileWriter(destination + filename,true);
			
			fw.write("Wggggggggggggggggggggggggggggggggggggggggggggg");
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
