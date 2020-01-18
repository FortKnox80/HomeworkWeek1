package bakery;

public class Writing extends CakeDecorator {
	Cake cake;
	
	public Writing(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "with a special message, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 9.99;
	}

}
