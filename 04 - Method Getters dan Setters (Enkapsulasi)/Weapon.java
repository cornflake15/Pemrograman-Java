public class Weapon{
	String name;
    double attackPower;

    public Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

	// Method get
    void getWeaponInfo(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}