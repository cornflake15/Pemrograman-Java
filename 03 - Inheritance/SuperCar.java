public class SuperCar extends Car {
	public int harga;
	public String warna;

	// Buat konstruktor tanpa argumen
	public SuperCar(){
		super();
		this.harga = 0;
		this.warna = "Unknown";
	}

	public SuperCar(String inMake, String inModel, 
					String inRegNo, int KMtravelled, 
					int harga, String warna){
		super();
		this.inMake = inMake;
		this.inModel = inModel;
		this.inRegNo = inRegNo;
		this.KMtravelled = KMtravelled;
		this.harga = harga;
		this.warna = warna;
	}

	public void getCarDetail(){
		System.out.println("Car Detail");
		System.out.println("  Car Make: " + this.inMake);
		System.out.println("  Car Model: " + this.inModel);
		System.out.println("  Car Registration Number: " + this.inRegNo);
		System.out.println("  Car Distance Travelled: " + this.KMtravelled);
		System.out.println("  Car Price: Rp." + this.harga + ", -");
		System.out.println("  Car Color: " + this.warna);
	}

}
