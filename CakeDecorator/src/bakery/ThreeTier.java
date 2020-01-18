package bakery;

public class ThreeTier extends CakeDecorator {
	Cake cake;
	
	ThreeTier(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "made with three tiers, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 59.99;
	}

}
