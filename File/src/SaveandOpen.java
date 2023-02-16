import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name,dept;
	
	public void insert() throws IOException{
		Scanner console = new Scanner(System.in);
		PrintStream prs = new  PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name :");
			name = console.next();
			System.out.print("Enter department");
			dept = console.next();
			prs.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = console.next();
		
	}

}
