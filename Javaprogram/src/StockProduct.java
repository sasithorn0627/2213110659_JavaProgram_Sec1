import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		double total = 0;
		Scanner scan = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("#,###.00");
		Product[] stproduct =new Product[4];
		for(int i=0;i<stproduct.length;i++) {
			stproduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stproduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stproduct[i].setUnit(scan.nextInt());
			while(!stproduct[i].checkunit()) {
				System.out.print("Input product unit  :" );
				stproduct[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product price : ");
			stproduct[i].setPrice(scan.nextDouble());
			while(!stproduct[i].checkprice()) {
				System.out.print("Input product Price : ");
				stproduct[i].setPrice(scan.nextDouble());
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------------");
		for(Product PDL : stproduct) {
			System.out.println("Product ID : "+PDL.getId()+", Total price = "+(PDL.calculate())+" baht.");
		}
		for(int i =0;i<stproduct.length;i++) {
			total=(stproduct[0].calculate()+stproduct[1].calculate()+stproduct[2].calculate()
					+stproduct[3].calculate());
		}
		System.out.println("---------------------------------------");
		System.out.println("Total price of all products is "+f1.format(total)+" baht.");

	}

}
