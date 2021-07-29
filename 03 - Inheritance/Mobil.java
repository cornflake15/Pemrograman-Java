public class Mobil {
	public static void main(String [] args){
		SuperCar mobil3 = new SuperCar();
		mobil3.getCarDetail();

		SuperCar mobil4 = new SuperCar("Honda",
									   "Civic",
									   "C20",
									   1,
									   100000000,
									   "Black"
		);
		mobil4.getCarDetail();


	}
}
