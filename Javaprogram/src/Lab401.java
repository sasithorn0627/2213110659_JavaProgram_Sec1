import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		if(!name.contains(" ")) {
			System.out.print("Incorrect Name");
			return;
		}
		int space = name.indexOf(" ");
		String firstname = name.substring(0,space).toUpperCase();
		String lastname = name.substring(space,name.length()).toLowerCase();
		System.out.println("Frist Name : "+firstname);
		System.out.print("Last Name : "+lastname);
		

	}

}
