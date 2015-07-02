//This program demos the employee and shift supervisor classes

public class ShiftSupervisorDemo {

	public static void main(String[] args) {
		
		//S1 is created using a constructor
		ShiftSupervisor s1 = 
				new ShiftSupervisor("Joan Holloway", "2512-J", "03/31/2000", 75000, 5400);
		
		//S2 is created
		ShiftSupervisor s2= new ShiftSupervisor();
		
		//Information for S2 is added using class methods
		s2.setName("Don Draper");
		s2.setID("1133-D");
		s2.setDate("06/12/1998");
		s2.setSalary(72000);
		s2.setBonus(4500);
		
		//Prints out information for both shift supervisors
		System.out.print(s1);
		System.out.print(s2);
		

	}

}
