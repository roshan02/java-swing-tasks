import java.io.*;
public class Multi1 extends Thread {
	 String s1 = TextAreaExample.s1;
	 public static String s2;
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
class Multi2 extends Thread {
	String s1 = TextAreaExample.s1;
	public void run() {
		if(new File(s1).exists()) {
		}
		else {
			System.err.println("Error: " + s1 + " does not exist.");
			System.exit(1);
		}
	}
}
