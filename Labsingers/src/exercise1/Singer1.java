package exercise1;
import javax.swing.JOptionPane;

public class Singer1 {

	public static void main (String [] args ) {
		
		String Id =JOptionPane.showInputDialog("What is your ID");
		Singers s1 = new Singers();
	    s1.setId(Id);
	    
		String name =JOptionPane.showInputDialog("What is your Name");
	    s1.setName(name);
	    
		String address =JOptionPane.showInputDialog("What is your Address");
		s1.setAddress(address);
		
		String dateofbirth =JOptionPane.showInputDialog("What is your Dateofbirth");
		s1.setDateofbirth(dateofbirth);
		
		String numberofalbumspublished =JOptionPane.showInputDialog("What is your Numberofalbumspublished");
		s1.setNumberofalbumspublished(numberofalbumspublished);
		
		String message =String.format("your name is added to the list ");
		
		JOptionPane.showMessageDialog(null, message);
	
		// commence le method 

		
		
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getAddress());
		System.out.println(s1.getDateofbirth());
		System.out.println(s1.getNumberofalbumspublished());

		

	

  }
}

