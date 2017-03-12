import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener, KeyListener {
	HashMap<String, String> rs = new HashMap<String, String>();
	String a = "";
	JFrame frame;
	JPanel panel;
	JButton b1;

	public static void main(String[] args) {
		RosettaStone x = new RosettaStone();

	}

	RosettaStone() {
		rs.put("Mesa", "Table");
		rs.put("Zapatos", "Shoes");
		rs.put("Camisa", "Shirt");
		rs.put("Blanca", "White");
		rs.put("Tortuga", "Tortoise");
		rs.put("Agua", "Water");
		rs.put("Gato", "Cat");
		rs.put("Playa", "Beach");
		rs.put("Biblioteca", "Library");
		rs.put("Dinero", "Money");
		rs.put("Pollo", "Chicken");
		rs.put("Sopa", "Soup");
		rs.put("Verduras", "Vegtables");
		rs.put("Computadora", "Computer");
		rs.put("Telephono", "TelePhone");

		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		b1 = new JButton("Mesa");

		panel.add(b1);
		frame.add(panel);

		b1.addActionListener(this);
		frame.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
if (rs.get(b1.getText()) != null) {
	b1.setText(rs.get(b1.getText()));
	

}
else{
	b1.setText(getRandomKey(rs));
}
		

	}

	String getRandomKey(HashMap<String, String> rs) {
		String[] keysAsArray = rs.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(rs.size());
		return keysAsArray[randomness];
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		}

	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
