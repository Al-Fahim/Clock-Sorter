import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ClockGUI { //display times in sorted order

	public ClockGUI(Clock[] array, Clock[] array2,int size) {
		
		JFrame frame = new JFrame("Project1");
		
		frame.setSize(500,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = frame.getContentPane();
		
		GridLayout layout = new GridLayout(1,2);
		
		frame.setLayout(layout);
		
		frame.setLocation(750,250); 
		
		JTextArea unsortedTA = new JTextArea(14,20);
		
		JTextArea sortedTA = new JTextArea(14,20);
		
		con.add(unsortedTA);//prints on left side
		
		con.add(sortedTA);// print on right side
		
		unsortedTA.append("unsorted:" + "\n");
		
		sortedTA.append("sorted:" + "\n");
		
		for(int i = 0; i < size; i++ ) { //print out the array's info
			
			unsortedTA.append(array[i] + "\n");
			sortedTA.append(array2[i] + "\n");
		
		}
		
		frame.setVisible(true);
	
	}
	
}