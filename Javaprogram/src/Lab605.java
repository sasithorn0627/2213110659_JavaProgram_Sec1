import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		for(int i = 0; i<nums.length;i++) {
			nums[i] =Integer.parseInt(JOptionPane.showInputDialog("Input number"+(i+1)+" :"));
		}
		showEven(nums);
		showOdd(nums);

	}
	private static void showEven(int[]list) {
	    String evenMsg ="";
	    for(int even  : list) {
	    	if(even%2==0) 
	    	{
	    		evenMsg = evenMsg +even+" ";
	    	}
	    }
	    JOptionPane.showMessageDialog(null, "List of even number: \n"+evenMsg,
	    		  "Message",JOptionPane.INFORMATION_MESSAGE);
	    
	}
	private static void showOdd(int[]list) {
		String oddMsg ="";
		for(int odd  : list)
			if(odd%2!=0) 
	    	{
	    		oddMsg = oddMsg +odd+" ";
	    	}
	    
	    JOptionPane.showMessageDialog(null, "List of odd number: \n"+oddMsg,
	    		  "Message",JOptionPane.INFORMATION_MESSAGE);
	}
		   
	}

