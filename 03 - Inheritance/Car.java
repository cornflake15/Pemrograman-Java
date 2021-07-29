public class Car {
	// Atribut
	protected String inMake;
	protected String inModel;
	public String inRegNo;
	public int KMtravelled;

	// Buat konstruktor tanpa argumen
	public Car(){
		this.inMake = "Unknown";
		this.inModel = "Unknown";
		this.inRegNo = "Unknown";
		this.KMtravelled = 0;
	}

	// Buat konstruktor dengan argumen
	public Car(String inMake, String inModel, String inRegNo, int KMtravelled){
		this.inMake = inMake;	
		this.inModel = inModel;
		this.inRegNo = inRegNo;
		this.KMtravelled = KMtravelled;
	}

	// Method setters
	public void setMake(String inMake){
		this.inMake = inMake;
	}

	public void setModel(String inModel){
		this.inModel = inModel;
	}

	public void setRegNo(String inRegNo){
		this.inRegNo = inRegNo;
	}

	public void setKMtravelled(int KMtravelled){
		this.KMtravelled = KMtravelled;
	}

	// Method getters
	public String getMake(){
		return this.inMake;
	}

	public String getModel(){
		return this.inModel;
	}

	public String getRegNo(){
		return this.inRegNo;
	}

	public int getKMtravelled(){
		return this.KMtravelled;
	}

	// Getters method untuk detail mobil
	public void getCarDetail(){
		System.out.println("Car Detail");
		System.out.println("  Car Make: " + this.inMake);
		System.out.println("  Car Model: " + this.inModel);
		System.out.println("  Car Registration Number: " + this.inRegNo);
		System.out.println("  Car Distance Travelled: " + this.KMtravelled);
	}

	// Method untuk KMtravelled
	public void move(int km){
		this.KMtravelled = this.KMtravelled + km;
		System.out.println("Distance move: " + this.KMtravelled);
	}
}
