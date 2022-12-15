import javax.swing.JOptionPane;

public class Lab_Example602_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptIsFound = false;
		
		String dept = JOptionPane.showInputDialog("Ener a departmen name");
		
		for (int i= 0; i< deptName.length;i++) {
			if (dept.equalsIgnoreCase(deptName[i])) {
				deptIsFound = true;
			}
		}
		JOptionPane.showInputDialog(null, (deptIsFound)
				? dept +"was found in the list"
				: dept +"was not found in the list");

	}

}
