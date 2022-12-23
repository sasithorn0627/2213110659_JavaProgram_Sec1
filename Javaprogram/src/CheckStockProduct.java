import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		System.out.println();
		Product[] cstock = new Product[list];
		for (int i = 0; i < cstock.length; i++) {
			cstock[i] = new Product();
			System.out.print("Input product Id   : ");
			cstock[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			cstock[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.print("--------------------------------");
		System.out.print("List of product in 'LOW' status.");
		System.out.print("--------------------------------");
		for (Product _cstock : cstock) {
			if (_cstock.check().equalsIgnoreCase("LOW")) {
				System.out.println(">> " + _cstock.getId() + " has " + _cstock.getUnit() + " units");
			}
		}

		System.out.print("--------------------------------");
		System.out.print("List of product in 'NORNAL' status.");
		System.out.print("--------------------------------");
		for (Product _cstock : cstock) {
			if (_cstock.check().equalsIgnoreCase("NORMAL")) {
				System.out.println(">> " + _cstock.getId() + " has " + _cstock.getUnit() + " units");
			}
		}

		System.out.print("--------------------------------");
		System.out.print("List of product in 'HIGH' status.");
		System.out.print("--------------------------------");
		for(Product _cstock : cstock) {
			if(_cstock.check().equalsIgnoreCase("HIGH")) {
				System.out.println(">> "+_cstock.getId()+" has "+_cstock.getUnit()+" units");
			}
	    }
	}
}
