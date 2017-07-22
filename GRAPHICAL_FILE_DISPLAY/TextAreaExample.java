import javax.swing.*;
import java.io.*;
import java.awt.event.*;
public class TextAreaExample implements ActionListener {
	JFrame f1 = new JFrame("INPUT WINDOW");
	JFrame f2 = new JFrame("FILE DATA OUTPUT");
	JTextArea area1;
	JTextArea area2;
	JButton b;
	TextAreaExample() {
		area1 = new JTextArea();
		area2 = new JTextArea();
		JScrollPane scroll = new JScrollPane (area2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		b = new JButton("click Me");
		b.setBounds(100, 95, 80, 30);
		f1.add(b);
		
		area1.setBounds(10, 30, 200, 60);
		f1.add(area1);
		f2.add(scroll);
		f1.setSize(300,140);
		f2.setSize(510, 510);  
		f1.setLayout(null);
		f1.setVisible(true);
		f2.setVisible(true);
		b.addActionListener(this);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static String s1;
	
	String s2 = "";
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			s1 = area1.getText();
			/*if(new File(s1).exists()) {
 			 //Do Stuff
			}
			else {
				System.err.println("Error: " + s1 + " does not exist.");
				//Or whatever other output stream you want to use
			}*/
			Multi1 t1 = new Multi1();
			Multi2 t2 = new Multi2();
			t2.start();
			t1.start();
	
			/*try {
				FileInputStream fin = new FileInputStream(s1);
				BufferedInputStream bin = new BufferedInputStream(fin);
				int i;
				while((i = bin.read()) != -1) {
					 s2 = s2 + (char)i;
				}
				bin.close();
				fin.close();
			}catch(Exception a) {
				System.out.println(a);
			}*/
			s2 = t1.s2;
			area2.setText(s2);
		}
	}
	public static void main(String args[]) {  
		new TextAreaExample();
	}
}
/*class Multi1 extends Thread,TextAreaExample {
	public void run() {
		try {
			FileInputStream fin = new FileInputStream(s1);
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i = bin.read()) != -1) {
				 s2 = s2 + (char)i;
			}
			bin.close();
			fin.close();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
}
class Multi2 extends Thread,TextAreaExample,Multi1 {
	public void run() {
		area2.setText(s2);
	}
}*/
