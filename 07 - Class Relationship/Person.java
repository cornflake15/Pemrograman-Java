public class Person {
	private String name;
	private int age;
	private Car ownedCar;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	// Setters method
	public void setOwnedCar(Car car){
		this.ownedCar = car;
	}

	// Getters method
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public boolean buyCar(Car inCar){
		// a method that allows this Person to own a Car object
		// if the person is aged 18 and above.
		if(this.age >= 18){
			this.ownedCar = inCar;
			return true;
		}
		else{
			return false;
		}
	}

	public String getCar(){
		// get the car owned by the Person. If the person does not
		// own a car then returns null.
		return this.ownedCar.inModel;
	}

	public boolean drive(int distanceInKM){
		// let the person drive the car that they own a certain 
		// distance, returns false if no car owned
		if(this.ownedCar == null){
			return false;
		}
		else{
			this.ownedCar.move(distanceInKM);
			return true;
		}
	}

	public void personDetail(){
			System.out.println("Hi nama saya " + this.name + ", umur saya " + this.age + ".");
			System.out.print("Saya baru saja membeli mobil " + this.ownedCar.inMake + " " 
							+ this.ownedCar.inModel);
	}

}
