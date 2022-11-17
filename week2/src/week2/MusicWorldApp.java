package week2;

import javax.swing.JOptionPane;

public class MusicWorldApp {
static final double TAX_RATE= 0.0625;
	public static void main(String[] args) {
		String cdId;
		String cdTitle;
		int cdQuantity;
		double cdPrice;
		double cdSubtotal;
		double cdTotal;
		cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order"+"\nPlease enter the ID the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String cdPricestr = JOptionPane.showInputDialog("Please enter the price  of the CD in US dollars");
		cdPrice = Double.parseDouble(cdPricestr);
		String cdQuantitystr = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		cdQuantity = Integer.parseInt(cdQuantitystr);
		cdSubtotal = cdPrice * cdQuantity;
		cdTotal = cdSubtotal * (1 + TAX_RATE);
		double tax=TAX_RATE*100;
		JOptionPane.showMessageDialog(null,"Summary  of the transaction:"+"\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCd Unit Price: $"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+"\nTax rate:"+tax+"%\nToal:"+cdTotal+"\n\nEnd of Program");
		
	}

}
