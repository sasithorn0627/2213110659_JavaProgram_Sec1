import java.util.*;
public class Lab601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] positiveNumber = new int[7];
		for (int i=0; i<positiveNumber.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			positiveNumber[i] = scan.nextInt();
			if(positiveNumber[1]%2 !=0) {
				countOfOdd++;
			}
		}
		System.out.println();
		System.out.println("There are "+countOfOdd+ "of odd number");
		for(int _posNum : positiveNumber) {
			System.out.print(_posNum+" ");
		}

	}

}
public static int countOddNumber(int[] num) {
	for(int i=0;<num.length;i++) {
		countOfOdd++;
	}
}


