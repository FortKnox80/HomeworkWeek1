package bakery;

public class FreshFlowers extends CakeDecorator {
	Cake cake;
	
	FreshFlowers(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "adorned with fresh flowers, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 29.99;
	}

}
