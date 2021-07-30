public class Armor{
    double defencePower;
    String name;

    public Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
	
	// Method set
	public void setArmorInformation(String name, double defence){
		this.name = name;
		this.defencePower = defence;
	}
}