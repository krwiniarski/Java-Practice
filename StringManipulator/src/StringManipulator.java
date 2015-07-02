import javax.swing.JOptionPane;	//Needed for the Scanner class

/**This program asks the user for to enter their favorite city then 
 * manipulates the inputed string in several ways
 * @author Kelsey
 */
public class StringManipulator {

	public static void main(String[] args) {
		String city;	//The user's favorite city
		
		//Get the user's favorite city
		city =
				JOptionPane.showInputDialog("What is the name " +
									"of your favorite city? ");
		
		//prints the length of city name
		System.out.println(city.length() + "\n");
		//prints city name in console in all upper case
		System.out.println(city.toUpperCase() + "\n");
		//prints city name in console in all lower case
		System.out.println(city.toLowerCase() + "\n");
		//prints first letter of city name in console
		System.out.println(city.charAt(0));
		
		
		System.exit(0);

	}

}
