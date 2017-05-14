import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TodoList implements ActionListener {
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
	
	addtask = new JButton("Add Task");
	removetask = new JButton("Remove Task");
	save = new JButton("Save");
	load = new JButton("Load");
	
	panel.add(addtask);
	panel.add(removetask);
	panel.add(save);
	panel.add(load);
	addtask.addActionListener(this);
	frame.add(panel);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == addtask) {
		String ans = JOptionPane.showInputDialog("Task");
	}
	
}
}
