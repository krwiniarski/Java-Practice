import java.util.Scanner; 	//Needed for the Scanner class

public class TestCar {

	public static void main(String[] args) {
		int model;		//The auto's model
		String make;	//The auto's make
		int speed;		//The auto's initial speed 
		
	
		Car auto = new Car(2013,"Car");
		//Create a scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
				
				
		//Get the year model of the car
		System.out.print("What is the year model of the car? ");
		model = keyboard.nextInt();
		auto.setMod(model);
				
		//Consume the remaining newline
		keyboard.nextLine();
				
		//Get the make of the car
		System.out.print("What is the make of the car? ");
		make = keyboard.nextLine();
		auto.setMake(make);
				
		//Get the speed of the car
		System.out.print("How fast is the car going? ");
		speed = keyboard.nextInt();
		auto.setSpeed(speed);
		
		//Uses accelerate method 5 times and prints speed 
		System.out.println("Let's start accelerating your car.\n" );
		auto.accelerate();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.accelerate();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.accelerate();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.accelerate();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.accelerate();
		System.out.println("The current speed is " + auto.getSpeed());
		
		//Uses break method 5 times and prints speed
		System.out.println("\nNow let's start hitting the brakes.\n");
		auto.brake();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.brake();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.brake();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.brake();
		System.out.println("The current speed is " + auto.getSpeed());
		auto.brake();
		System.out.println("The current speed is " + auto.getSpeed());
	
		
		keyboard.close();	
	}

}
