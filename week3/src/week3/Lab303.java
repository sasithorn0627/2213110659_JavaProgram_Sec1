package week3;
import java.util.Random;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.text.*;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		DecimalFormat f3 = new DecimalFormat("#,###");
		int balance = rand.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+f3.format(balance)+"\nInput money to withdraw:"));
		int b10 =money/1000;
		int b5 =(money%1000)/500;
		int b1 = (money%1000)%500/100;
		if(money>balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(money>20000) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(money%100!=0) {
			int n1 = money%100;
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+n1+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"You withdraw "+f3.format(money)+" baht."+"\n1000 = "+b10+"\n500 = "+b5+"\n100 = "+b1);
		}
		

	}

}
