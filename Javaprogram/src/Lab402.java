import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = input.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = input.nextLine();
			if(sentence.endsWith(".")) {
				break;
			}
		}
		System.out.println();
		int numberofindex = 0;
		String format = sentence.replace("."," ");  
		for(int i=0;i<format.length();i++){
			if(format.charAt(i) == ' ') {
				System.out.println(format.substring(numberofindex, i));
				numberofindex=i+1;
			}
		}

	}

}
