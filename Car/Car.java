/**
 * This Car class represents a car
 */
public class Car {
	//Fields
	private int yearModel;
	private String make;
	private int speed=0;

/**
 * The constructor accepts arguments for
 * the car's year model and make
 */
public Car(int mod, String mk)
{
	yearModel = mod;
	make = mk; 
}

/**
 * The setMod method accepts an argument that
 * is stored in the yearModel field
 */
public void setMod(int mod)
{
	yearModel = mod;
}

/**
 * The setMake method accepts an argument that is
 * stored in the make field
 */
public void setMake(String make)
{
	this.make = make;
}

/**
 * The setSpeed method accepts an argument that is
 * stored in the speed field
 */
public void setSpeed(int speed)
{
	this.speed = speed;
}
/**
 * The getMod method returns the car's year model 
 */
public int getMod()
{
	return yearModel;
}

/**
 * The getMake method returns the car's make
 */
public String getMake()
{
	return make;
}

/**
 * The getSpeed method returns the cars speed
 */
public int getSpeed()
{
	return speed;
}

/**
 * The accelerate method adds the parameter amount
 * to the speed field
 */
public int accelerate()
{
	return speed = (speed + 5);
}

/**
 * The brake method subtracts the parameter amount
 * from the speed field
 */
public int brake()
{
	return speed = (speed - 5);
}
}