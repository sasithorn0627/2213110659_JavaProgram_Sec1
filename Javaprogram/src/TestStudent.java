import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int inputstd = scan.nextInt();
		System.out.println();
		Student[]std = new Student[inputstd];
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();
			//System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			//System.out.println("-----------------------------");
			System.out.print("Input Student Name: ");
			// std[i] = scan.next();
			std[i].setName(scan.next());
			System.out.print("Input Student Score:");
			std[i].setScore(scan.nextInt());
			while(!std[i].cheackScore()) {
				System.out.print("Input Student Score, again:");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("-------------------------------------------");
			//System.out.println();
		}
		//System.out.println();
		//System.out.println("LIST OF STUDENT (>=50)");
		//System.out.println("----------------------------------------------");
		for(Student stds : std){
			if(stds.isPass()) {
				System.out.println(">> "+stds.getName()+" get grade "+stds.findGrade());
			}
		}

	}

}
