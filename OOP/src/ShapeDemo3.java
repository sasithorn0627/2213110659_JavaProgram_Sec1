import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cylinder = new Cylinder[5];
		for(int i = 0;i<cylinder.length;i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius"+(i+1)));
		}

	}

}
