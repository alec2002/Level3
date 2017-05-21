import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TodoList implements ActionListener {
	String sss = "";
	JLabel jl;
	FileWriter fw;
	ArrayList<String> list = new ArrayList<String>();
	JFrame frame;
	JPanel panel;
	JButton addtask;
	JButton removetask;
	JButton save;
	JButton load;
public static void main(String[] args) {
	TodoList x = new TodoList();
}
TodoList(){
	
	
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	
	jl = new JLabel("");
	addtask = new JButton("Add Task");
	removetask = new JButton("Remove Task");
	save = new JButton("Save");
	load = new JButton("Load");
	
	panel.add(addtask);
	panel.add(removetask);
	panel.add(save);
	panel.add(load);
	panel.add(jl);
	addtask.addActionListener(this);
	removetask.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
	frame.add(panel);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == addtask) {
		String ans = JOptionPane.showInputDialog("Task");
		list.add(ans);
		sss = "<html>";
		for (String ss : list) {
			sss +=ss + "<br>";
		}
		sss += "</html>";
		jl.setText(sss);
		WritetoFile();
		
	}
	if (e.getSource() == removetask) {
		list.remove(list.size() - 1);
		//look
		for (String ss : list) {
			sss +=ss + "<br>";
		}
		sss += "</html>";
		jl.setText(sss);
		//look
	}
	if (e.getSource() == save) {
		WritetoFile();
	}
	if (e.getSource() == load) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/test2.txt"));
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
				list.add(line);
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
e2.printStackTrace();
		}}

	
}
void WritetoFile(){
	try {
		fw = new FileWriter("src/test2.txt");
		for (String s : list) {
			fw.write(s + "\n");
		}
		
			
		fw.close();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
}
}
