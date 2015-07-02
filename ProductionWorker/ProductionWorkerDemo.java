//This program demos the employee and production worker classes

public class ProductionWorkerDemo {

	public static void main(String[] args) {
		
		//Employee 1 is created using the constructor
		ProductionWorker emp1 = 
				new ProductionWorker("Tina Belcher", 
						"9201-B", "05/02/2013", 2, 10.50);
		
		//Employee 2 is created
		ProductionWorker emp2 = new ProductionWorker();
		
		//Employee 2's information is filled in using methods
		emp2.setName("Bob Belcher");
		emp2.setID("4421-J");
		emp2.setDate("04/23/2010");
		emp2.setShift(2);
		emp2.setPay(18.25);
		
		//Prints both employees information
		System.out.print(emp1);
		System.out.print(emp2);

	}

}
