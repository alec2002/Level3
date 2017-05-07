import java.io.FileReader;

import javax.swing.JFileChooser;

public class MessageEncrypter2 {
	String fileName = "";

	public static void main(String[] args) {
		MessageEncrypter2 x = new MessageEncrypter2();
	}

	MessageEncrypter2() {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("DHDhdhd");
			fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
		}

		try {
			FileReader frr = new FileReader(fileName);
			int r = frr.read();
			while (r != -1) {
				System.out.print((char) (r - 10));
				r = frr.read();

			}
			frr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
