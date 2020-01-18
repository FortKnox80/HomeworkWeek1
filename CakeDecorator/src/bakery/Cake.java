package bakery;

public abstract class Cake {
	//Initial cake flavor
	String cakeFlavor = "Uknown Cake Flavor";
	
	//How each cake will print out their flavor
	public String getCakeFlavor() {
		return "A " +cakeFlavor + " Cake: ";
	}
	
	public abstract double cost();

}
