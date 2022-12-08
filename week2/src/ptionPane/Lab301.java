package ptionPane;
import javax.swing.*;
import java.text.*;
public class Lab301 {

	public static void main(String[] args) {
		static final int pricePerson = 299;
		public static void main(String[] atgs) {
			int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
			
			double totalPrice = pricePerson * numberofCustomer;
			int memberCard = JOptionPane.showComfirmDialog(null,"Total Price is "+totalPrice+" baht."+"\nDo you have a member card?");
			double totalPricewithDiscount;
			if(memberCard == 0) {
				totalPricewithDiscount = totalPrice * 90 /100;
				JOptionPane.showmessageDialog(null,"Amount to be paid is "+frm.format(totalPricewithDiscount)+" baht.");
				
			}else if (memberCard ==1) {
				JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(totalPrice)+" baht.");
			}
		}

	}

}
