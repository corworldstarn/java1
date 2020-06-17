import javax.swing.JOptionPane;

public class Program{

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);	
		System.out.println(3);
		String id = JOptionPane.showInputDialog("Enter a id");
		double doubleTypeId = Double.parseDouble(id);
//		System.out.println(getClass(doubleTypeId));
		System.out.println(id);
		System.out.println(doubleTypeId);
		
	}

}
