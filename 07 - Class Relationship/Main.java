public class Main {
	public static void main(String [] arg){
		Person p1 = new Person("James Bond", 50);

		Car car1 = new Car("Honda",
							"Civic",
							"C20",
							1);

		p1.buyCar(car1);
		car1.setOwner(p1);

		car1.getCarDetail();
		p1.personDetail();
	}
	
}
