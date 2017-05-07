import java.io.FileReader;
import java.io.FileWriter;


public class FunWithFiles {
public static void main(String[] args) {
	FunWithFiles x = new FunWithFiles();
}
FunWithFiles(){
	try {
		FileWriter fw = new FileWriter("file");
		fw.write("What's up?");
		fw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		FileReader fr = new FileReader("file");
		int c = fr.read();
		while(c != -1){
			System.out.print((char)c);
			c = fr.read();
			
		}
		fr.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
