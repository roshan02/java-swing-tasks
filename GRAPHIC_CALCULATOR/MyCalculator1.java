import javax.swing.*;  
import java.awt.event.*;  
public class MyCalculator1 implements ActionListener{  
	JTextField tf1;  
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,bp,be,bc,bmod,br;  
	MyCalculator1(){  
		JFrame f= new JFrame("CALCULATOR");  
		tf1=new JTextField();  
		tf1.setBounds(5,5,290,50);
		//tf1.setEditable(false);
		bmod = new JButton("%");
		bmod.setBounds(200,60,87,35);
		br = new JButton("+/-");
		br.setBounds(105,60,90,35);
		bc = new JButton("CE");
		bc.setBounds(5,60,95,35);
		bp = new JButton(".");
		bp.setBounds(72,220,70,38);
		be = new JButton("=");
		be.setBounds(145,220,70,38);
		bs = new JButton("-");
		bs.setBounds(217,220,70,38);
		b0 = new JButton("0");
		b0.setBounds(5,220,70,38);
		b1 = new JButton("1");
		b1.setBounds(5,180,70,38);
		b2 = new JButton("2");
		b2.setBounds(72,180,70,38);
		b3 = new JButton("3");
		b3.setBounds(145,180,70,38);
		ba = new JButton("+");
		ba.setBounds(217,180,70,38);
		b4 = new JButton("4");
		b4.setBounds(5,140,70,38);
		b5 = new JButton("5");
		b5.setBounds(72,140,70,38);
		b6 = new JButton("6");
		b6.setBounds(145,140,70,38);
		bm = new JButton("*");
		bm.setBounds(217,140,70,38);
		b7 = new JButton("7");
		b7.setBounds(5,100,70,38);
		b8 = new JButton("8");
		b8.setBounds(72,100,70,38);
		b9 = new JButton("9");
		b9.setBounds(145,100,70,38);
		bd = new JButton("/");
		bd.setBounds(217,100,70,38);
		b1.addActionListener(this);  
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		bp.addActionListener(this);
		bc.addActionListener(this);
		bmod.addActionListener(this);
		br.addActionListener(this);
		f.add(tf1);f.add(b1);f.add(b2);f.add(b7);f.add(b8);f.add(b9);f.add(bd);f.add(bm);f.add(b4);f.add(b5);f.add(b6);f.add(b1);f.add(b2);f.add(b3);f.add(ba);f.add(b0);f.add(bp);f.add(be);f.add(bs);f.add(bc);f.add(bmod);f.add(br);  
		f.setSize(300,270);  
		f.setLayout(null);  
		f.setVisible(true);  
	}   
	static float num1 = 0f, num2 = 0f;   
	static int op = 1;
	static int p = 0;
	static float fact = 10f;
	static int clear = 0;
	public void actionPerformed(ActionEvent e) {  
		if(e.getSource() == bc) {
			num1 = num2 = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == br) {
			num1 = -num1;
		}
		else if(e.getSource() == b1) {
			if(p == 0) { 
				num1 = num1 * 10 + 1;
			}
			else {
				num1 = num1 + 1/fact;
				fact = fact * 10;
			}
		}
		else if(e.getSource() == b2) {
			if(p == 0) { 
				num1 = num1 * 10 + 2;
			}
			else {
				num1 = num1 + 2/fact;
				fact = fact * 10;
			}
 		}
		else if(e.getSource() == b3) {
			if(p == 0) { 
				num1 = num1 * 10 + 3;
			}
			else {
				num1 = num1 + 3/fact;
				fact = fact * 10;
			}

		} 
		else if(e.getSource() == b4) {
			if(p == 0) { 
				num1 = num1 * 10 + 4;
			}
			else {
				num1 = num1 + 4/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b5) {
			if(p == 0) { 
				num1 = num1 * 10 + 5;
			}
			else {
				num1 = num1 + 5/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b6) {
			if(p == 0) { 
				num1 = num1 * 10 + 6;
			}
			else {
				num1 = num1 + 6/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b7) {
			if(p == 0) { 
				num1 = num1 * 10 + 7;
			}
			else {
				num1 = num1 + 7/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b8) {
			if(p == 0) { 
				num1 = num1 * 10 + 8;
			}
			else {
				num1 = num1 + 8/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b9) {
			if(p == 0) { 
				num1 = num1 * 10 + 9;
			}
			else {
				num1 = num1 + 9/fact;
				fact = fact * 10;
			}

		}
		else if(e.getSource() == b0) {
			if(p == 0) { 
				num1 = num1 * 10 + 0;
			}
			else {
				num1 = num1 + 0/fact;
				fact = fact * 10;
			}

 		}
 		else if(e.getSource() == bp) {
			p = 1;
		}
 		else if(e.getSource() == ba) {
 			num2 = num1;
			num1 = 0;
			op = 1;
			p = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == bs) {
			num2 = num1;
			num1 = 0;
			op = 2;
			p = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == bm) {
			num2 = num1;
			num1 = 0;
			op = 3;
			p = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == bd) {
			num2 = num1;
			num1 = 0;
			op = 4;
			p = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == bmod) {
 			num2 = num1;
			num1 = 0;
			op = 5;
			p = 0;
			fact = 10f;
			clear = 1;
		}
		else if(e.getSource() == be) {
			p = 0;
			fact = 10;
			if(op == 1) {  
				num1 = num1 + num2;
				num2 = 0;
			}
			else if(op == 2) {
				num1 = num2 - num1;
				num2 = 0;
			}
			else if(op == 3) {
				num1 = num2 * num1;
				num2 = 0;
			}
			else if(op == 4) {
				num1 = num2 / num1;
				num2 = 0;
			}
			else if(op == 5) {
				num1 = num2 % num1;
				num2 = 0;
			}
		}
	  
		String result=String.valueOf(num1);  
		if(clear == 0) {
			tf1.setText(result);
		}
		else {
			result = "";
			tf1.setText(result);
			clear = 0;
		}
	}
	public static void main(String[] args) {  
    		new MyCalculator1();  
	}
}  
