package bakery;

public class Fruit extends CakeDecorator {
	Cake cake;
	
	Fruit(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "add some fresh fruit, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 19.99;
	}

}
