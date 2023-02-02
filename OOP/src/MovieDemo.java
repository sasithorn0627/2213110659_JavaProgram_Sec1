import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.print("Input movie id\t  : ");
		String movieID = scan.nextLine();
		System.out.print("Input movie name  : ");
		String movieNAME = scan.nextLine();
		System.out.println();

		System.out.print("Input director name\t: ");
		String directorNAME = scan.nextLine();
		System.out.print("Input director e-mail\t: ");
		String directorEMAIL = scan.nextLine();
		System.out.print("Input director gender\t: ");
		String directorGENDER = scan.nextLine();

		while (!directorGENDER.equalsIgnoreCase("m") && !directorGENDER.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again\t: ");
			directorGENDER = scan.nextLine();
		}
		System.out.println();

		System.out.print("Input movie theater no.\t : ");
		int theaterNo = scan.nextInt();

		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}

		Theater theater = new Theater(movieID, movieNAME, new Director(directorNAME, directorEMAIL, directorGENDER.charAt(0)), theaterNo);

		System.out.println();
		System.out.println(theater);
	}

}