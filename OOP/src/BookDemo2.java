import java.util.*;
import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Input author name:");
		String email=JOptionPane.showInputDialog("Input author e-mail:");
		String title=JOptionPane.showInputDialog("Inputbook title:");
		int page=Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int choice = JOptionPane.showConfirmDialog(null, "Isthe page correct",
				title,JOptionPane.YES_NO_OPTION);
		while (choice ==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:"));
			choice =JOptionPane.showConfirmDialog(null,"Is the page correct",title,JOptionPane.YES_NO_OPTION);
		}
		Book1 book1 = new Book1(title,new Author(name,email),page);
		
		JOptionPane.showMessageDialog(null,"Book title :"+book1.getTitle()+"\nAuthor name : "+book1.getAuthor().getName() +" ("+book1.getPage()+" page)"
				+"\nAuthor email:"+book1.getAuthor().getEmail());

	}

}
