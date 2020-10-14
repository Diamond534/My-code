package java20200923;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//引用；p132,“包”
import javax.swing.*;

public class Test1 {
	public static void main(String[] args) {
		
		JButton btn;
		JFrame f1;
		JLabel l1;
		
		Animal a1,a2,a3;
		a1=new Animal();
		a2=new Dog(null);
		a3=new fish(null);  //****多态*****
		a1.run();
		a2.run();
		a3.run();
		
//		Dog d1;
//		d1=(Dog)new Animal(); 
//		System.out.print("xxxxxxxxx");
//		
	}

}
